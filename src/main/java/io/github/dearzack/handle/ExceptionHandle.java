package io.github.dearzack.handle;

import io.github.dearzack.bean.Result;
import io.github.dearzack.ecception.GirlException;
import io.github.dearzack.utils.ResultUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Zack on 2017/4/23.
 */
@ControllerAdvice
public class ExceptionHandle {

    @ExceptionHandler(value = GirlException.class)
    @ResponseBody
    public Result handle(Exception e) {
        if (e instanceof GirlException) {
            GirlException girlException = (GirlException) e;
            return ResultUtils.error(girlException.getCode(), girlException.getMessage());
        } else {
            return ResultUtils.error(-1, "未知错误。");
        }
    }
}
