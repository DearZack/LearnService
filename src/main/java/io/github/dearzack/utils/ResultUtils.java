package io.github.dearzack.utils;

import io.github.dearzack.bean.Result;

/**
 * Created by Zack on 2017/4/23.
 */
public class ResultUtils {

    public static Result success(Object object) {
        Result result = new Result();
        result.setCode(200);
        result.setMsg("成功");
        result.setContent(object);
        return result;
    }

    public static Result success() {
        return success(null);
    }

    public static Result error(Integer code, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
