package com.example.BookingService.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;

@Entity
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class Seat {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private	int id;
	private String seatId;
	private String seatClass;
	
	
	/**
	 * @param seatId
	 * @param seatClass
	 */
	public Seat(String seatId, String seatClass) {
		super();
		this.seatId = seatId;
		this.seatClass = seatClass;
	}
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

	
}
