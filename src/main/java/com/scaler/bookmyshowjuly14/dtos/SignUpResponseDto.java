package com.scaler.bookmyshowjuly14.dtos;

public class SignUpResponseDto {
    private ResponseStatus status;
    private String failureMessage;
    private Long userId;

    public ResponseStatus getStatus() {
        return this.status;
    }

    public String getFailureMessage() {
        return this.failureMessage;
    }

    public Long getUserId() {
        return this.userId;
    }

    public void setStatus(ResponseStatus status) {
        this.status = status;
    }

    public void setFailureMessage(String failureMessage) {
        this.failureMessage = failureMessage;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
