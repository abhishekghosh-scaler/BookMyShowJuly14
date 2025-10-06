package com.scaler.bookmyshowjuly14.models;

import jakarta.persistence.Entity;

@Entity
public class SeatType extends BaseModel {
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
