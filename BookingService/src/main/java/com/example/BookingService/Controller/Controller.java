package com.example.BookingService.Controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.BookingService.Dto.SeatPrice;
import com.example.BookingService.Model.Booking;
import com.example.BookingService.Model.DataSheat;
import com.example.BookingService.ServiceLayer.BookingService;
import com.example.BookingService.ServiceLayer.SeatService;

import io.swagger.v3.oas.annotations.tags.Tag;

@Validated
@RestController
@Tag(name = "Controller", description = "Operation on Bookig Seats")
public class Controller {

	
	private BookingService bookingService;
	
	@Autowired
	private SeatService seatService;
	private Booking booking;
	private SeatPrice seatPrice;
	
	/**
	 * @param bookingService
	 */
	@Autowired
	public Controller(BookingService bookingService) {
		super();
		this.bookingService = bookingService;
	}

	/**
	 * @param seatService
	 * @param booking
	 * @param seatPrice
	 * @param bookingService
	 */
//	@Autowired
//	public Controller(SeatService seatService, com.example.BookingService.Model.Booking booking, SeatPrice seatPrice,
//			BookingService bookingService) {
//		super();
//		this.seatService = seatService;
//		this.booking = booking;
//		this.seatPrice = seatPrice;
//		this.bookingService = bookingService;
//	}

	@GetMapping("/seats")
	public List<DataSheat> getseats() {
		return seatService.getAllSeats();
	}
	
	@GetMapping("/bookings/{email}")
	public ResponseEntity<?> getbookings(@PathVariable String email) {

	       booking = seatService.getBookings(email);

	        if (booking != null) {
	        	System.out.print("No entity");
	        	return ResponseEntity.ok(booking);
	        } else {
	          
	            String errorMessage = "No Records not found with email:  " + email;
	            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);
	        }
	}
	
	@GetMapping("/seat/{id}" )
	public ResponseEntity<?> price(@PathVariable String id) {
		  seatPrice =  seatService.seatDetails(id);	
		
		  if (seatPrice != null) {
	        	
	        	return ResponseEntity.ok(seatPrice);
	        } else {
	 	            String errorMessage = "No Records not found with SeatId:  " + id;
	            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);
	        }	
		
	}
	
	
	@PostMapping("/booking")
    public 	Booking Booking(@RequestParam List<String> seatids, 
    		@RequestParam String Email, @RequestParam String Number) {
		
//		BookingService bookingService = new BookingService();
		booking = bookingService.seatBooking(seatids, Email, Number);
		return booking ;	
	}
}
