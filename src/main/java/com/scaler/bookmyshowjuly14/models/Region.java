package com.scaler.bookmyshowjuly14.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Region extends BaseModel {
    private String name;

    @OneToMany
    private List<Theatre> theatres;

    public String getName() {
        return this.name;
    }

    public List<Theatre> getTheatres() {
        return this.theatres;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTheatres(List<Theatre> theatres) {
        this.theatres = theatres;
    }
}

/*
* Region : Theatre
* 1           M
* 1           1
* 1: M
* */
