# Booking Service

## Objective

The objective is to build a Booking Service which allows users to choose seats and book them. The service will provide APIs for seat retrieval, seat pricing, booking creation, and booking retrieval. Additionally, it will handle different pricing strategies based on seat availability.

## Technology Stack

- **Backend Framework**: Java, Springboot, Hibernate/JPA 
- **Database**: MySQL

## Assignment Specifications

### Seat Pricing Logic

- **Less than 40% booked**: Use `min_price`, if not available, use `normal_price`
- **40% - 60% booked**: Use `normal_price`, if not available, use `max_price`
- **More than 60% booked**: Use `max_price`, if not available, use `normal_price`

### APIs to be Built

1. **Get All Seats**
   - **Endpoint**: `GET /seats`
   - **Description**: Returns all seats, ordered by seat class, with a boolean `is_booked` for each seat.

2. **Get Seat Pricing**
   - **Endpoint**: `GET /seats/:id`
   - **Description**: Returns the seat details along with pricing based on the class and bookings made.

3. **Create Booking**
   - **Endpoint**: `POST /booking`
   - **Description**: Creates a booking for selected seats. Accepts an array of seat IDs, user's name, and phone number. Returns a booking ID and total amount if successful, otherwise an error message.

4. **Retrieve Bookings**
   - **Endpoint**: `GET /bookings?userIdentifier=<email or phone number>`
   - **Description**: Returns all bookings made by the user identified by email or phone number. Returns an error if no identifier is provided.

### Bonus Features

1. **Notification Integration**: Send booking confirmation via Email or SMS using third-party providers like Twilio, Sendgrid, or Textlocal.
2. **Data Upload Script**: Script to upload default data to the database from a CSV file.

## How to Run

### Prerequisites

- JDK with Eclipse
-  MySQL
- Postman (for testing APIs)

### Setup

1. **Clone the Repository**
   ```bash
   git clone <https://github.com/ashok0706/FlrunSeatBookingService>
 
