package com.scaler.bookmyshowjuly14.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Screen extends BaseModel
{
    private String name;

    @ManyToOne
    private Theatre theatre;

    @OneToMany
    private List<Seat> seats;
}
