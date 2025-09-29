package com.scaler.bookmyshowjuly14.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity(name = "shows")
public class Show extends BaseModel
{
    @ManyToOne
    private Screen screen;

    @ManyToOne
    private Movie movie;
    private Date timing;
}
