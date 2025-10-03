package com.scaler.bookmyshowjuly14.services;

import com.scaler.bookmyshowjuly14.models.Booking;

import java.util.List;

public interface BookingService
{
    Booking bookMovie(List<Long> showSeatIds, Long userId, Long showId);
}
