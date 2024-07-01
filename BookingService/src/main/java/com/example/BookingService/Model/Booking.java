package com.example.BookingService.Model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;

@Entity
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class Booking {

	 @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int id;
     @Email
//     @NotEmpty
     private String email;
//     @NotEmpty()
     @Size(min=0,max=10)
     private String phoneNumber;
     private double price;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Seat> bookingseats;

//	public Booking(){}

	/**
	 * @param email
	 * @param phoneNumber
	 * @param price
	 * @param bookingseats
	 */
	public Booking(@Email @NotEmpty String email, @NotEmpty @Size(min = 0, max = 10) String phoneNumber,
			List<Seat> bookingseats, double price) {
//		super();
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.price = price;
		this.bookingseats = bookingseats;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public List<Seat> getBookingseats() {
		return bookingseats;
	}

	public void setBookingseats(List<Seat> bookingseats) {
		this.bookingseats = bookingseats;
	}
	
	
	
}
