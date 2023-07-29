package com.driver.Repository;

import com.driver.model.Booking;

import java.util.HashMap;

public class BookingsRepository {
    private final HashMap<String, Booking> bookingDb = new HashMap<>();

    public void addBooking(Booking booking,String bookingId){
        bookingDb.put(bookingId,booking);
    }




}
