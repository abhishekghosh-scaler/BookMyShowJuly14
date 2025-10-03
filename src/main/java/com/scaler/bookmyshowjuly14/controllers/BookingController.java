package com.scaler.bookmyshowjuly14.controllers;

import com.scaler.bookmyshowjuly14.dtos.BookingRequestDto;
import com.scaler.bookmyshowjuly14.dtos.BookingResponseDto;
import com.scaler.bookmyshowjuly14.dtos.ResponseStatus;
import com.scaler.bookmyshowjuly14.models.Booking;
import com.scaler.bookmyshowjuly14.services.BookingService;
import org.springframework.stereotype.Controller;

@Controller
public class BookingController
{
    private final BookingService bookingService;
    public BookingController(BookingService bookingService)
    {
        this.bookingService = bookingService;
    }

    public BookingResponseDto bookMovie(BookingRequestDto bookingRequestDto)
    {
        BookingResponseDto bookingResponseDto = new BookingResponseDto();

        try
        {
            Booking booking = bookingService.bookMovie(
                    bookingRequestDto.getShowSeatIds(),
                    bookingRequestDto.getUserId(),
                    bookingRequestDto.getShowId());

            bookingResponseDto.setBookingId(booking.getId());
            bookingResponseDto.setStatus(ResponseStatus.SUCCESS);
        }
        catch (Exception e)
        {
            bookingResponseDto.setStatus(ResponseStatus.FAILURE);
            bookingResponseDto.setFailureMessage(e.getMessage());
        }

        return bookingResponseDto;
    }
}
