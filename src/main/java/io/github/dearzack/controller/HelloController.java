package io.github.dearzack.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Zack on 2017/4/20.
 */

@RestController
public class HelloController {

    @Value("${cupSize}")//通过注解来获取application.properties配置文件中的属性
    private String cupSize;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String say() {
        return "Hello Spring Boot!!" + cupSize;
    }
}
