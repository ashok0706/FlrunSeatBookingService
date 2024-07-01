package com.example.BookingService.Dto;


import com.example.BookingService.Model.DataSheat;

public class SeatPrice {
	
    private	int id;
	private String seatId;
	private String seatClass;
	private String bookingStatus;
	private double seatPrice;
	
	
	
	/**
	 * @param seatId
	 * @param seatClass
	 * @param bookingStatus
	 * @param seatPrice
	 */
	public SeatPrice(String seatId, String seatClass, String bookingStatus, double seatPrice) {
		super();
		this.seatId = seatId;
		this.seatClass = seatClass;
		this.bookingStatus = bookingStatus;
		this.seatPrice = seatPrice;
	}
	public String getBookingStatus() {
		return bookingStatus;
	}
	public void setBokingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}
	public double getSeatPrice() {
		return seatPrice;
	}
	public void setSeatPrice(double seatPrice) {
		this.seatPrice = seatPrice;
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
