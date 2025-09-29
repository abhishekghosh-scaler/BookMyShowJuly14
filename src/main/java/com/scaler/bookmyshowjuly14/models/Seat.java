package com.scaler.bookmyshowjuly14.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Seat extends BaseModel
{
    private String number;

    @ManyToOne
    private SeatType seatType;
    private int rowVal;
    private int colVal;
}

/*
* Seat: SeatType
* 1      1
* M      1
* */