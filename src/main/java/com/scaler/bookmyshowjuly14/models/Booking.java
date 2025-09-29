package com.scaler.bookmyshowjuly14.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Booking extends BaseModel
{
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
}
