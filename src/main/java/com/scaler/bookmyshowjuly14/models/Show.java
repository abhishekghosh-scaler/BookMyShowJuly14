package com.scaler.bookmyshowjuly14.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.Date;
import java.util.List;

@Entity(name = "shows")
public class Show extends BaseModel {
    @ManyToOne
    private Screen screen;

    @ManyToOne
    private Movie movie;
    private Date timing;

    @OneToMany
    private List<ShowSeat> showSeats;

    @OneToMany
    private List<ShowSeatType> showSeatTypes;

    public Screen getScreen() {
        return this.screen;
    }

    public Movie getMovie() {
        return this.movie;
    }

    public Date getTiming() {
        return this.timing;
    }

    public List<ShowSeat> getShowSeats() {
        return this.showSeats;
    }

    public List<ShowSeatType> getShowSeatTypes() {
        return this.showSeatTypes;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public void setTiming(Date timing) {
        this.timing = timing;
    }

    public void setShowSeats(List<ShowSeat> showSeats) {
        this.showSeats = showSeats;
    }

    public void setShowSeatTypes(List<ShowSeatType> showSeatTypes) {
        this.showSeatTypes = showSeatTypes;
    }
}
