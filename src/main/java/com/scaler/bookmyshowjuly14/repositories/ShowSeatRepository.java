package com.scaler.bookmyshowjuly14.repositories;

import com.scaler.bookmyshowjuly14.models.ShowSeat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShowSeatRepository extends JpaRepository<ShowSeat, Long>
{
    @Override
    List<ShowSeat> findAllById(Iterable<Long> longs);

    /*
    * If id is present => Update
    * If id is not present => Insert
    * */
    @Override
    ShowSeat save(ShowSeat showSeat);
}
