package com.scaler.bookmyshowjuly14.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class Seat extends BaseModel {
    private String number;

    @ManyToOne
    private SeatType seatType;
    private int rowVal;
    private int colVal;

    public String getNumber() {
        return this.number;
    }

    public SeatType getSeatType() {
        return this.seatType;
    }

    public int getRowVal() {
        return this.rowVal;
    }

    public int getColVal() {
        return this.colVal;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setSeatType(SeatType seatType) {
        this.seatType = seatType;
    }

    public void setRowVal(int rowVal) {
        this.rowVal = rowVal;
    }

    public void setColVal(int colVal) {
        this.colVal = colVal;
    }
}

/*
* Seat: SeatType
* 1      1
* M      1
* */