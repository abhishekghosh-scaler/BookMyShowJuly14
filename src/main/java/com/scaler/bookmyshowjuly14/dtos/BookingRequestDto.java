package com.scaler.bookmyshowjuly14.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BookingRequestDto
{
    private List<Long> showSeatIds;
    private Long userId;
    private Long showId;    // as a good measure
}
