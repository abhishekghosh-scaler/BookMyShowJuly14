package com.scaler.bookmyshowjuly14.services;

import com.scaler.bookmyshowjuly14.models.Show;
import com.scaler.bookmyshowjuly14.models.ShowSeat;

import java.util.List;

public interface PriceCalculator
{
    double calculatePrice(List<ShowSeat> showSeats, Show show);
}
