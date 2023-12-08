package com.harsh.BookingService.repository;

import com.harsh.BookingService.model.Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
public interface SeatRepository extends JpaRepository<Seat,Long> {
//    List<Seat> findAllSeatsOrderedBySeatClass(String seatClass);

    List<Seat> findAllByOrderBySeatClassAsc();
}