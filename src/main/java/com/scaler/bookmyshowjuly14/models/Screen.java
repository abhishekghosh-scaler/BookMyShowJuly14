package com.scaler.bookmyshowjuly14.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Screen extends BaseModel {
    private String name;

    @ManyToOne
    private Theatre theatre;

    @OneToMany
    private List<Seat> seats;

    public String getName() {
        return this.name;
    }

    public Theatre getTheatre() {
        return this.theatre;
    }

    public List<Seat> getSeats() {
        return this.seats;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTheatre(Theatre theatre) {
        this.theatre = theatre;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }
}
