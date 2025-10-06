package com.scaler.bookmyshowjuly14.dtos;

import java.util.List;

public class BookingRequestDto {
    private List<Long> showSeatIds;
    private Long userId;
    private Long showId;    // as a good measure

    public List<Long> getShowSeatIds() {
        return this.showSeatIds;
    }

    public Long getUserId() {
        return this.userId;
    }

    public Long getShowId() {
        return this.showId;
    }

    public void setShowSeatIds(List<Long> showSeatIds) {
        this.showSeatIds = showSeatIds;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setShowId(Long showId) {
        this.showId = showId;
    }
}
