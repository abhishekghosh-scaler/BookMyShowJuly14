package com.scaler.bookmyshowjuly14.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;

@Entity
public class ShowSeatType extends BaseModel {
    @OneToOne
    private Show show;

    @OneToOne
    private SeatType seatType;
    private double price;

    public Show getShow() {
        return this.show;
    }

    public SeatType getSeatType() {
        return this.seatType;
    }

    public double getPrice() {
        return this.price;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    public void setSeatType(SeatType seatType) {
        this.seatType = seatType;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
