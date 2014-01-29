package com.sidney.myspring.repository.ibatis;

public class Result {
    /**
     * 执行结果
     */
    private boolean success;

    /**
     * 消息结果
     */
    private String message;

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}