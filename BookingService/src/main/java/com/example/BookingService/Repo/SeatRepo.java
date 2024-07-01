package com.example.BookingService.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.BookingService.Model.Seat;

@Repository
public interface SeatRepo extends JpaRepository<Seat, Integer>{

	Seat findFirstBySeatId(String sr);

	Seat findBySeatId(String sr);

}
