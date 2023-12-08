package com.harsh.BookingService.repository;

import com.harsh.BookingService.model.SeatPricing;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SeatPricingRepository extends JpaRepository<SeatPricing,Long> {

    Optional<SeatPricing> findBySeatClass(String seatClass);
}