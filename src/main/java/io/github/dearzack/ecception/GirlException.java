package io.github.dearzack.ecception;

import io.github.dearzack.enums.ResultEnum;

/**
 * Created by Zack on 2017/4/23.
 */
public class GirlException extends RuntimeException{
    private Integer code;

    public GirlException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
