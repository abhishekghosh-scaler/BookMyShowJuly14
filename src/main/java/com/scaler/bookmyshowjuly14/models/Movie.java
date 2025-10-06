package com.scaler.bookmyshowjuly14.models;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import java.util.List;

@Entity
public class Movie extends BaseModel {
    private String title;
    private String director;
    private String year;
    private String genre;
    private String rating;
    private int duration;

    @Enumerated(EnumType.ORDINAL)
    @ElementCollection
    private List<Feature> features;

    public String getTitle() {
        return this.title;
    }

    public String getDirector() {
        return this.director;
    }

    public String getYear() {
        return this.year;
    }

    public String getGenre() {
        return this.genre;
    }

    public String getRating() {
        return this.rating;
    }

    public int getDuration() {
        return this.duration;
    }

    public List<Feature> getFeatures() {
        return this.features;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }
}
