package com.scaler.bookmyshowjuly14.services;

import com.scaler.bookmyshowjuly14.models.Booking;
import com.scaler.bookmyshowjuly14.repositories.BookingRepository;
import com.scaler.bookmyshowjuly14.repositories.ShowRepository;
import com.scaler.bookmyshowjuly14.repositories.ShowSeatRepository;
import com.scaler.bookmyshowjuly14.repositories.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(isolation = Isolation.SERIALIZABLE)
public class BookingServiceImpl implements BookingService
{
    private final BookingRepository bookingRepository;
    private final UserRepository userRepository;
    private final ShowRepository showRepository;
    private final ShowSeatRepository showSeatRepository;

    public BookingServiceImpl(BookingRepository bookingRepository,
                              UserRepository userRepository,
                              ShowRepository showRepository,
                              ShowSeatRepository showSeatRepository)
    {
        this.bookingRepository = bookingRepository;
        this.userRepository = userRepository;
        this.showRepository = showRepository;
        this.showSeatRepository = showSeatRepository;
    }

    @Override
    public Booking bookMovie(List<Long> showSeatIds, Long userId, Long showId)
    {
        /*
        * 1. Get show details from the DB
        * 2. Get user details from the DB
        * ------ Acquire the lock ------
        * 3. Get all the ShowSeats corresponding to showSeatIds
        * 4. Check if seats are available
        * 5. If not, we throw an exception
        * 6. Change the status to BLOCKED
        * 7. Save details to DB
        * ------ Release the lock ------
        * 8. Create the booking object
        * 9. Save to DB and return the Booking object created
        * */
        return null;
    }
}
