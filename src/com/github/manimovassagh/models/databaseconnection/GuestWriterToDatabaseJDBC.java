package com.github.manimovassagh.models.databaseconnection;

import com.github.manimovassagh.models.persons.Guest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import static com.github.manimovassagh.models.databaseconnection.GuestReaderFromDatabaseJDBC.*;

/**
 * Write a guest into mySQL Database with JDBC
 */
public class GuestWriterToDatabaseJDBC implements GuestDAO {
    Connection connectToGuestDatabase;

    /**
     * This method is responsible for writing data in database
     * @param guest the guest that booked the room
     */
    public void writerToDatabase(Guest guest) {
        {
            try {
                connectToGuestDatabase = DriverManager.getConnection(CONNECTIVITY, USER, PASSWORD);
                Statement packaging = connectToGuestDatabase.createStatement();
                String writeToDatabase = "INSERT INTO " + GUEST_TABLE
                        + " VALUES (NULL, "
                        + "'" + guest.getName() + "'"
                        + ","
                        + "'" + guest.getFamily() + "'"
                        + ","
                        + "'" + guest.getGender() + "'"
                        + ","
                        + guest.getAge() + ","
                        + guest.getNumberOfNightsToStay() + ")";
                System.out.println(writeToDatabase);
                packaging.execute(writeToDatabase);
            } catch (SQLException e) {
                e.getMessage();
                e.printStackTrace();
            }
        }

    }

    /**
     * Get all booking data from database
     * @return booking list collection
     */
    @Override
    public List<Guest> getAllGuests() {
        return null;
    }

    /**
     * Add booked guest to database
     * @param guest booked guest
     */
    @Override
    public void addGuest(Guest guest) {
        writerToDatabase(guest);
    }

    /**
     * Delete booked guest from database
     * @param guest the guest that we want to delete from database
     */
    @Override
    public void deleteGuest(Guest guest) {

    }

    /**
     * Update specific booked guest from database
     * @param guest  guest that we want to change(update) in database
     */
    @Override
    public void updateGuest(Guest guest) {

    }
}
