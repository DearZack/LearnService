package io.github.dearzack.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Zack on 2017/4/23.
 */
@Aspect
@Component
public class HttpAspect {

    private static final Logger logger = LoggerFactory.getLogger(HttpAspect.class);

    //拦截getGirls（）..表示任意参数都可以
//    @Before("execution(public * io.github.dearzack.controller.GirlController.getGirls(..))")
    //拦截这个controller中的所有方法
//    @Before("execution(public * io.github.dearzack.controller.GirlController.*(..))")
    @Pointcut("execution(public * io.github.dearzack.controller.GirlController.*(..))")//推荐这种
    public void log() {
    }

//    @Before("execution(public * io.github.dearzack.controller.GirlController.*(..))")//两种方法效果一致
    @Before("log()")
    public void doBefore(JoinPoint joinPoint) {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        //url
        logger.info("url={}", request.getRequestURL());
        //method
        logger.info("method={}", request.getMethod());
        //ip
        logger.info("ip={}", request.getRemoteAddr());
        //类方法
        logger.info("class_method={}", joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
        //参数
        for (Object o : joinPoint.getArgs()) {
            logger.info("args={}", o.toString());
        }
    }

    @After("log()")
    public void doAfter() {
        logger.info("222222");
    }

    @AfterReturning(returning = "object", pointcut = "log()")
    public void doAfterReturning(Object object) {
        logger.info("response={}", object.toString());
    }
}
