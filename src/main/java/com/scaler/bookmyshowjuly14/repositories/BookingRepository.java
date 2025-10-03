package com.scaler.bookmyshowjuly14.repositories;

import com.scaler.bookmyshowjuly14.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long>
{
}
