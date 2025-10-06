package com.scaler.bookmyshowjuly14.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Theatre extends BaseModel {
    private String name;

    @OneToMany(mappedBy = "theatre")
    private List<Screen> screens;

    public String getName() {
        return this.name;
    }

    public List<Screen> getScreens() {
        return this.screens;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScreens(List<Screen> screens) {
        this.screens = screens;
    }
}
