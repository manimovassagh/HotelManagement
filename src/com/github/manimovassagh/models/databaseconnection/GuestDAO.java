package com.github.manimovassagh.models.databaseconnection;

import com.github.manimovassagh.models.persons.Guest;

import java.util.List;

public interface GuestDAO {
    /**
     * get all booked data for all guests
     * @return list og booked guests
     */
    List<Guest> getAllGuests();

    /**
     * add booked guest data to database
     */
    void addGuest(Guest guest);

    /**
     * delete booked guest from database
     */
    void deleteGuest(Guest guest);

    /**
     * update booked guest in database
     */
    void updateGuest(Guest guest);

}
