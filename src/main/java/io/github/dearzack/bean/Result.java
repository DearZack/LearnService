package io.github.dearzack.bean;

/**
 * Created by Zack on 2017/4/23.
 */
public class Result<T> {
    private Integer code;
    private String msg;
    private T content;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
}
