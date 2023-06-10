package com.teach.wiki.Resp;

public class IMOOCJSONResult {

    // 404 没有资源
    //200 请求成功
    //500 请求错误，信息封装在msg中


    // 响应状态
    private  Integer status;

    // 响应信息
    private String msg;

    // 响应中的数据
    private Object data;


    public static IMOOCJSONResult build(Integer status, String msg, Object data) {
        return new IMOOCJSONResult(status, msg, data);
    }

    public static IMOOCJSONResult build(Integer status, String msg, Object data, String ok) {
        return new IMOOCJSONResult(status, msg, data, ok);
    }

    public static IMOOCJSONResult ok(Object data) {
        return new IMOOCJSONResult(data);
    }

    public static IMOOCJSONResult ok() {
        return new IMOOCJSONResult(null);
    }

    public static IMOOCJSONResult errorMsg(String msg) {
        return new IMOOCJSONResult(500, msg, null);
    }

    public static IMOOCJSONResult errorMap(Object data) {
        return new IMOOCJSONResult(501, "error", data);
    }

    public static IMOOCJSONResult errorTokenMsg(String msg) {
        return new IMOOCJSONResult(502, msg, null);
    }

    public static IMOOCJSONResult errorException(String msg) {
        return new IMOOCJSONResult(555, msg, null);
    }

    public static IMOOCJSONResult errorUserQQ(String msg) {
        return new IMOOCJSONResult(556, msg, null);
    }

    public IMOOCJSONResult() {

    }

    public IMOOCJSONResult(Integer status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public IMOOCJSONResult(Integer status, String msg, Object data, String ok) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public IMOOCJSONResult(Object data) {
        this.status = 200;
        this.msg = "OK";
        this.data = data;
    }

    public Boolean isOK() {
        return this.status == 200;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}
