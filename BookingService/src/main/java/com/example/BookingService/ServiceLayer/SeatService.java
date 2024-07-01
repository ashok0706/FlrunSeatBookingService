package com.example.BookingService.ServiceLayer;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.BookingService.Dto.Calculation;
import com.example.BookingService.Dto.SeatPrice;
import com.example.BookingService.Model.Booking;
import com.example.BookingService.Model.DataSheat;
import com.example.BookingService.Model.Seat;
import com.example.BookingService.Repo.BookingRepo;
import com.example.BookingService.Repo.SeatRepo;
import com.example.BookingService.Repo.dataSheatRepo;




@Service
public class SeatService {
	
	@Autowired
	BookingRepo bookingRepo;	
	Booking booking;
	SeatPrice seatPrice;
	DataSheat dataSheat;
	
	@Inject
	dataSheatRepo dataSheatRepo;



	public List<DataSheat> getAllSeats() {
		return dataSheatRepo.findAll();
	}

	public Booking getBookings(String email) {
		
		try {
			booking = bookingRepo.findAllByEmail(email);
			System.out.print(email);
			return booking;
		} catch (Exception e) {
			return booking;
		}
	}

	public SeatPrice seatDetails(String id) {
		seatPrice = null;
	try {
		dataSheat = dataSheatRepo.findFirstBySeatId(id);
		
		double price = new Calculation().price(dataSheat.getSeatId());
		
		return new SeatPrice(dataSheat.getSeatId(), dataSheat.getSeatClass(),dataSheat.getBookingStatus(), price);
		
	} catch (Exception e) {
	
		return  seatPrice;
	}				
  }	
}
