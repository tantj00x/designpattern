package org.example.factory.schemes02.entity;

/**
 * 响应结果封装类
 */
public class ResponseResult {

    /**
     * 状态码
     */
    private String status;

    /**
     * 信息
     */
    private String message;

    /**
     * 响应数据
     */
    private Object data;

    public ResponseResult() {
    }

    public ResponseResult(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public ResponseResult(String status, String message, Object data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResponseResult{" +
                "status='" + status + '\'' +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
