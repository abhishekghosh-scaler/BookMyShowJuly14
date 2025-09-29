package com.scaler.bookmyshowjuly14.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ShowSeatType extends BaseModel
{
    @OneToOne
    private Show show;

    @OneToOne
    private SeatType seatType;
    private double price;
}
