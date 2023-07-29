package com.driver.Service;

import com.driver.Repository.BookingsRepository;
import com.driver.model.Booking;

public class BookingService {
  private final BookingsRepository bookingsRepository = new BookingsRepository();

  public void addBooking(Booking booking, String bookingId){
      bookingsRepository.addBooking(booking, bookingId);

  }

}
