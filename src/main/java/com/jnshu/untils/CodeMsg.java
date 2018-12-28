package com.jnshu.untils;

/**
 * @author Mr_Wang
 */
public class CodeMsg {
    private String code;
    private String msg;
    //通用的错误码
    /**
     *
     */
    public static CodeMsg SUCCESS = new CodeMsg("200","success");
    public static CodeMsg SERVER_ERROR = new CodeMsg("500", "error");
    public static CodeMsg BIND_ERROR = new CodeMsg("405", "参数校验异常：%s");

    public CodeMsg(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "CodeMsg [code=" + code + ", msg=" + msg + "]";
    }


}