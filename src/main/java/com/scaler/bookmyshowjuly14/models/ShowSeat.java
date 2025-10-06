package com.scaler.bookmyshowjuly14.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToOne;

import java.util.Date;

@Entity
public class ShowSeat extends BaseModel {
    @OneToOne
    private Show show;
    @OneToOne
    private Seat seat;

    @Enumerated(EnumType.ORDINAL)
    private ShowSeatStatus status;

    private Date bookedAt;

    public Show getShow() {
        return this.show;
    }

    public Seat getSeat() {
        return this.seat;
    }

    public ShowSeatStatus getStatus() {
        return this.status;
    }

    public Date getBookedAt() {
        return this.bookedAt;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public void setStatus(ShowSeatStatus status) {
        this.status = status;
    }

    public void setBookedAt(Date bookedAt) {
        this.bookedAt = bookedAt;
    }
}
