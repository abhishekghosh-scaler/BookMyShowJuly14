package com.scaler.bookmyshowjuly14.services;

import com.scaler.bookmyshowjuly14.models.Show;
import com.scaler.bookmyshowjuly14.models.ShowSeat;
import com.scaler.bookmyshowjuly14.models.ShowSeatType;
import com.scaler.bookmyshowjuly14.repositories.ShowSeatTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriceCalculatorImpl implements PriceCalculator
{

    private final ShowSeatTypeRepository showSeatTypeRepository;

    public PriceCalculatorImpl(ShowSeatTypeRepository showSeatTypeRepository) {
        this.showSeatTypeRepository = showSeatTypeRepository;
    }

    @Override
    public double calculatePrice(List<ShowSeat> showSeats, Show show)
    {
        double price = 0;
        List<ShowSeatType> showSeatTypes = showSeatTypeRepository.findByShow(show);
        for (ShowSeat showSeat : showSeats)
        {
            for (ShowSeatType showSeatType : showSeatTypes)
            {
                if(showSeat.getSeat().getSeatType().equals(showSeatType.getSeatType()))
                {
                    price += showSeatType.getPrice();
                    break;
                }
            }
        }

        return price;
    }
}
