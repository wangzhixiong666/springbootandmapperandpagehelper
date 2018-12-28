package com.jnshu.untils;


/**
 * @author Mr_Wang
 */
public class Result<T> {
    private String code;
    private String msg;
    private T data;


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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    /**
     *
     * @param code
     * @param msg
     * @param data
     */
    public Result(String code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    /**
     * @param code
     * @param msg
     */
    public Result(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Result(T data) {
        this.data = data;
        this.code = CodeMsg.SUCCESS.getCode();
        this.msg = CodeMsg.SUCCESS.getMsg();
    }

    public Result() {
        this.code = CodeMsg.SUCCESS.getCode();
        this.msg = CodeMsg.SUCCESS.getMsg();
    }



    /***
     * 输入参数：
     * @param data
     * @return 返回成功，包含code、msg、data
     */
    public static  <T> Result success(T data) {
        return new Result(data);
    }

    public static  <T> Result success(){
        return new Result();
    }

    public static  <T> Result success(String code, String msg){
        return new Result(code,msg);
    }


    /**
     * 错误返回
     */

    /**
     * 失败时调用
     */

    public static <T> Result error(CodeMsg codeMsg){
        return new Result (codeMsg.getCode(),codeMsg.getMsg());
    }

}