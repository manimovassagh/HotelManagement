package com.github.manimovassagh.models.databaseconnection;

import com.github.manimovassagh.models.persons.Guest;

import java.util.List;

/**
 * Define a Data access object for our service
 */
public interface GuestDAO {
    /**
     * get all booked data for all guests
     * @return list og booked guests
     */
    List<Guest> getAllGuests();

    /**
     * add booked guest data to database
     * @param guest guest to be added
     */
    void addGuest(Guest guest);

    /**
     * delete booked guest from database
     * @param guest to be deleted
     */
    void deleteGuest(Guest guest);

    /**
     * update booked guest in database
     * @param guest guest to be updated
     */
    void updateGuest(Guest guest);

}
