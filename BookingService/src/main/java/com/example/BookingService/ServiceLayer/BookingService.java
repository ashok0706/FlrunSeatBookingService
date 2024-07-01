package com.example.BookingService.ServiceLayer;

import java.util.ArrayList;

import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.example.BookingService.Dto.Calculation;
import com.example.BookingService.Model.Booking;
import com.example.BookingService.Model.DataSheat;
import com.example.BookingService.Model.Seat;
import com.example.BookingService.Repo.BookingRepo;
import com.example.BookingService.Repo.SeatRepo;
import com.example.BookingService.Repo.dataSheatRepo;

@Component
public class BookingService {
		
	private BookingRepo bookingRepo;
	
	@Autowired
	private  dataSheatRepo dataSheatRepo ;
	
	@Autowired
	private SeatRepo seatRepo;
	private DataSheat dataSheat;
	private Booking booking;
	
	

	/**
	 * @param dataSheatRepo
	 */
	@Autowired
	public BookingService(BookingRepo bookingRepo) {
		super();
		this.bookingRepo = bookingRepo;
	}


	public Booking seatBooking(List<String> seatids, String mail, String number) {	
		
     	List<Seat> seats = new ArrayList<Seat>();
     	double price = 0.00;
		for(int i=0; i<seatids.size(); i++) {	
			String sr = seatids.get(i);
			System.out.print(sr);
				dataSheat = dataSheatRepo.findFirstBySeatId(sr);
			Seat seat =  seatRepo.findBySeatId(sr);
			if(seat == null) {
//				seats.add(new Seat(seat.getSeatId(), "  SeatId is already booked", "true") );
				continue;
			}
			else {
//				seatRepo.updateSeatStatus(seat.getSeatId(), "True");
				seats.add(new Seat(dataSheat.getSeatId(), dataSheat.getSeatClass()));
				price+=new Calculation().price(seat.getSeatClass());
			}
		  }	  		  		     
		   booking = new Booking(mail, number, seats, price);
		   bookingRepo.save(booking);
	      return booking;
	}


}
