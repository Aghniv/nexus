package com.hotel.Nexus.services;

import com.hotel.Nexus.dtos.BookingDTO;
import com.hotel.Nexus.dtos.Response;

public interface BookingService {

    Response getAllBookings();
    Response createBooking(BookingDTO bookingDTO);
    Response findBookingByReferenceNo(String  bookingReference);
    Response updateBooking(BookingDTO bookingDTO);
}
