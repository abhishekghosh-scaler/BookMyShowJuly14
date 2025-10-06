package com.scaler.bookmyshowjuly14.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity(name = "users")
public class User extends BaseModel {
    private String username;
    private String password;

    @OneToMany
    private List<Booking> bookings;

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public List<Booking> getBookings() {
        return this.bookings;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }
}
