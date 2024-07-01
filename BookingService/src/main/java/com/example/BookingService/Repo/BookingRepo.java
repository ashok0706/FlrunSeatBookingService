package com.example.BookingService.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.BookingService.Model.Booking;

@Repository
public interface BookingRepo extends JpaRepository<Booking, Integer> {

	Booking findAllByEmail(String email);

}
