package com.github.manimovassagh.models.databaseconnection;

import com.github.manimovassagh.models.persons.Guest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import static com.github.manimovassagh.models.databaseconnection.GuestReaderFromDatabaseJDBC.*;

public class GuestWriterToDatabaseJDBC {
    Connection connectToGuestDatabase;

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
                        + "'" + guest.getGender()+"'"
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
}
