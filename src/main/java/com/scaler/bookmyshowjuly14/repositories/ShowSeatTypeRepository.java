package com.scaler.bookmyshowjuly14.repositories;

import com.scaler.bookmyshowjuly14.models.Show;
import com.scaler.bookmyshowjuly14.models.ShowSeatType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShowSeatTypeRepository extends JpaRepository<ShowSeatType, Long>
{
    List<ShowSeatType> findByShow(Show show);
}
