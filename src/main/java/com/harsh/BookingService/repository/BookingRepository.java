package com.harsh.BookingService.repository;

import com.harsh.BookingService.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking,Long> {
    List<Booking> findByUserNameOrPhoneNumber(String userIdentifier, String userIdentifier1);
}