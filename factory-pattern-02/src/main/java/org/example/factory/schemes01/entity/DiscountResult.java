package org.example.factory.schemes01.entity;

/**
 * 打折券操作响应结果封装类
 */
public class DiscountResult {

    /**
     * 状态码
     */
    private String status;

    /**
     * 信息
     */
    private String message;

    public DiscountResult() {
    }

    public DiscountResult(String status, String message) {
        this.status = status;
        this.message = message;
    }
}
