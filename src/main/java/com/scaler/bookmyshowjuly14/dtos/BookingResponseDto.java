package com.scaler.bookmyshowjuly14.dtos;

public class BookingResponseDto {
    private ResponseStatus status;
    private String failureMessage;
    private Long bookingId;

    public ResponseStatus getStatus() {
        return this.status;
    }

    public String getFailureMessage() {
        return this.failureMessage;
    }

    public Long getBookingId() {
        return this.bookingId;
    }

    public void setStatus(ResponseStatus status) {
        this.status = status;
    }

    public void setFailureMessage(String failureMessage) {
        this.failureMessage = failureMessage;
    }

    public void setBookingId(Long bookingId) {
        this.bookingId = bookingId;
    }
}
