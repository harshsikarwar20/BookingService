package com.harsh.BookingService.controllers;

import com.harsh.BookingService.model.dto.SeatDetails;
import com.harsh.BookingService.model.Seat;
import com.harsh.BookingService.service.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/seats")
public class SeatController {

    @Autowired
    private  SeatService seatService;

    @GetMapping()
    public ResponseEntity<List<Seat>> getAllSeats() {
        List<Seat> seats = seatService.getAllSeats();
        return ResponseEntity.ok(seats);
    }
    @GetMapping("/{id}")
    public ResponseEntity<SeatDetails> getSeatPricingById(@PathVariable Long id) {
        return seatService.getSeatPricingById(id);
    }

}