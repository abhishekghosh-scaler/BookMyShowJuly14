package com.scaler.bookmyshowjuly14.services;

import com.scaler.bookmyshowjuly14.models.*;
import com.scaler.bookmyshowjuly14.repositories.BookingRepository;
import com.scaler.bookmyshowjuly14.repositories.ShowRepository;
import com.scaler.bookmyshowjuly14.repositories.ShowSeatRepository;
import com.scaler.bookmyshowjuly14.repositories.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@Transactional(isolation = Isolation.SERIALIZABLE)
public class BookingServiceImpl implements BookingService
{
    private final BookingRepository bookingRepository;
    private final UserRepository userRepository;
    private final ShowRepository showRepository;
    private final ShowSeatRepository showSeatRepository;
    private final PriceCalculator priceCalculator;

    public BookingServiceImpl(BookingRepository bookingRepository,
                              UserRepository userRepository,
                              ShowRepository showRepository,
                              ShowSeatRepository showSeatRepository, PriceCalculator priceCalculator)
    {
        this.bookingRepository = bookingRepository;
        this.userRepository = userRepository;
        this.showRepository = showRepository;
        this.showSeatRepository = showSeatRepository;
        this.priceCalculator = priceCalculator;
    }

    @Override
    public Booking bookMovie(List<Long> showSeatIds, Long userId, Long showId)
    {
//        * 1. Get show details from the DB
        Optional<Show> showOptional = showRepository.findById(showId);
        if(showOptional.isEmpty())
        {
            throw new IllegalArgumentException("Show not found");
        }

        Show bookedShow = showOptional.get();

//        * 2. Get user details from the DB
        Optional<User> userOptional = userRepository.findById(userId);
        if(userOptional.isEmpty())
        {
            throw new IllegalArgumentException("User not found");
        }

        User bookedBy = userOptional.get();

//        * ------ Acquire the lock ------
//        * 3. Get all the ShowSeats corresponding to showSeatIds
        List<ShowSeat> showSeats = showSeatRepository.findAllById(showSeatIds);

//        * 4. Check if seats are available
        for (ShowSeat showSeat : showSeats)
        {
//        * 5. If not, we throw an exception
            if (!showSeat.getStatus().equals(ShowSeatStatus.AVAILABLE))
            {
                if(showSeat.getStatus().equals(ShowSeatStatus.BLOCKED) &&
                        Duration.between(showSeat.getBookedAt().toInstant(),
                                new Date().toInstant()).toMinutes() > 15)
                {
                    throw new RuntimeException("Blocked seats must be released");
                }
                throw new RuntimeException("Show seat not available");
            }
        }
//        * 6. Change the status to BLOCKED
        for (ShowSeat showSeat : showSeats)
        {
            showSeat.setStatus(ShowSeatStatus.BLOCKED);
            showSeat.setBookedAt(new Date());

//        * 7. Save details to DB
            showSeatRepository.save(showSeat);
        }

//        * ------ Release the lock ------
//        * 8. Create the booking object
        Booking booking = new Booking();
        booking.setBookedAt(new Date());
        booking.setBookedBy(bookedBy);
        booking.setPayments(new ArrayList<>());
        booking.setStatus(BookingStatus.PENDING);
        booking.setShowSeats(showSeats);
        booking.setTotalAmount(priceCalculator.calculatePrice(showSeats, bookedShow));

//        * 9. Save to DB and return the Booking object created
        return bookingRepository.save(booking);
    }
}
