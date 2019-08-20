package com.example;

public class ResponseBean<T> {

    public static final boolean SUCCESS = true;

    public static final boolean FAIL = false;

    private T data;

    private boolean result;

    private String error;

    private String errorMessage;

    public ResponseBean(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public static <T> ResponseBean<T> build(T data, boolean result) {
        ResponseBean responseBean = new ResponseBean(data);
        responseBean.setResult(result);
        return responseBean;
    }
}
