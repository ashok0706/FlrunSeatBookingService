package com.example.BookingService.Model;

//import com.example.BookingService.Repo.dataSheatRepo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;

//@Data
@Entity
//@AllArgsConstructor
//@NoArgsConstructor
public class DataSheat {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	
	@Column(name = "seat_identifier")
	private String seatId;
	
	@Column(name = "seat_class")
	private String seatClass;
	
	@Column(name = "bookingStatus")
	private String  bookingStatus;
	

//	/**
//	 * @param seatId
//	 * @param seatClass
//	 * @param bookingStatus
//	 */
//	public DataSheat(String seatId, String seatClass, String bookingStatus) {
//		super();
//		this.seatId = seatId;
//		this.seatClass = seatClass;
//		this.bookingStatus = bookingStatus;
//	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSeatId() {
		return seatId;
	}

	public void setSeatId(String seatId) {
		this.seatId = seatId;
	}

	public String getSeatClass() {
		return seatClass;
	}

	public void setSeatClass(String seatClass) {
		this.seatClass = seatClass;
	}

	public String getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}
	
	
}
