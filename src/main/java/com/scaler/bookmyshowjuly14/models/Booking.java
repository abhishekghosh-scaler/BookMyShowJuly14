package com.scaler.bookmyshowjuly14.models;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Booking extends BaseModel {
    @ManyToOne
    private User bookedBy;
    private Date bookedAt;
    private double totalAmount;

    @OneToMany
    private List<Payment> payments;

    @ManyToMany
    private List<ShowSeat> showSeats;

    @Enumerated(EnumType.ORDINAL)
    private BookingStatus status;

    public User getBookedBy() {
        return this.bookedBy;
    }

    public Date getBookedAt() {
        return this.bookedAt;
    }

    public double getTotalAmount() {
        return this.totalAmount;
    }

    public List<Payment> getPayments() {
        return this.payments;
    }

    public List<ShowSeat> getShowSeats() {
        return this.showSeats;
    }

    public BookingStatus getStatus() {
        return this.status;
    }

    public void setBookedBy(User bookedBy) {
        this.bookedBy = bookedBy;
    }

    public void setBookedAt(Date bookedAt) {
        this.bookedAt = bookedAt;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

    public void setShowSeats(List<ShowSeat> showSeats) {
        this.showSeats = showSeats;
    }

    public void setStatus(BookingStatus status) {
        this.status = status;
    }
}
