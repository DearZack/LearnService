package io.github.dearzack.enums;

/**
 * Created by Zack on 2017/4/23.
 */
public enum  ResultEnum {

    UNKNOWN(-1, "未知错误"),
    SUCCESS(200, "成功"),
    SMALL(301, "小学生吧，滚蛋"),
    MIDDLE(302, "还没有成年，走开");

    private Integer code;

    private String msg;

    private ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
