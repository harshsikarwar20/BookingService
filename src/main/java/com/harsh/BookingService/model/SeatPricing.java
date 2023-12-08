package com.harsh.BookingService.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SeatPricing {

    @Id
    private Long id;
    private String seatClass;
    private double minPrice;
    private double maxPrice;
    private double normalPrice;

}