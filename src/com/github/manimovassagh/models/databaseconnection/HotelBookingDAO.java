package com.github.manimovassagh.models.databaseconnection;

import com.github.manimovassagh.models.persons.Guest;

import java.util.List;

public interface HotelBookingDAO {
    /**
     * get all booked data for all guests
     * @return list og booked guests
     */
    List<Guest> getAllBookingData();

    /**
     * add booked guest data to database
     */
    void addBookedData(Guest guest);

    /**
     * delete booked guest from database
     */
    void deleteBookedData(Guest guest);

    /**
     * update booked guest in database
     */
    void updateBookedData(Guest guest);

}
