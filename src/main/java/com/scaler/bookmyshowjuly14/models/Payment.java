package com.scaler.bookmyshowjuly14.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;

import java.util.Date;

@Entity
public class Payment extends BaseModel {
    @ManyToOne
    private Booking booking;
    private double amount;
    private Date bookedAt;
    private String transactionId;

    @Enumerated(EnumType.STRING)
    private PaymentStatus status;

    @Enumerated(EnumType.STRING)
    private PaymentGateway paymentGateway;

    public Booking getBooking() {
        return this.booking;
    }

    public double getAmount() {
        return this.amount;
    }

    public Date getBookedAt() {
        return this.bookedAt;
    }

    public String getTransactionId() {
        return this.transactionId;
    }

    public PaymentStatus getStatus() {
        return this.status;
    }

    public PaymentGateway getPaymentGateway() {
        return this.paymentGateway;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setBookedAt(Date bookedAt) {
        this.bookedAt = bookedAt;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }

    public void setPaymentGateway(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }
}
