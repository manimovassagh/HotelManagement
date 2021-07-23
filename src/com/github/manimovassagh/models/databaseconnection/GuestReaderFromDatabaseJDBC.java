package com.github.manimovassagh.models.databaseconnection;


import com.github.manimovassagh.models.persons.Gender;
import com.github.manimovassagh.models.persons.Guest;
import com.github.manimovassagh.services.GenderSwitcher;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * this class is for connecting to mySQL database
 */
public class GuestReaderFromDatabaseJDBC {
    /**
     * all 4 below lines are standard JDBC Connecting , you specify connectivity,user,password and table.finished !!
     */
    public static final String CONNECTIVITY = "jdbc:mysql://localhost:3306/guestdb";
    public static final String USER = "root";
    public static final String PASSWORD = "";
    public static final String GUEST_TABLE = "guest";

    private List<Guest> allGuestsList = new ArrayList<>();

    /**
     * this method read data from database
     */
    public void readGuestTableFromDatabase() {
        try (Connection connectToGuestDatabase = DriverManager.getConnection(CONNECTIVITY, USER, PASSWORD)) {

            Statement packaging = connectToGuestDatabase.createStatement();
            String query = "SELECT * FROM " + GUEST_TABLE;
            ResultSet returnResultFromDatabase = packaging.executeQuery(query);
            while (returnResultFromDatabase.next()) {
                int guestId = returnResultFromDatabase.getInt("id");
                String name = returnResultFromDatabase.getString("name");
                String family = returnResultFromDatabase.getString("family");
                String gender = returnResultFromDatabase.getString("gender");
                Gender convertedGender = GenderSwitcher.genderConverter(gender);
                int age = returnResultFromDatabase.getInt("age");
                int nighOfStayInHotel = returnResultFromDatabase.getInt("nights");
                Guest newGuest = new Guest(name, family, convertedGender, age, nighOfStayInHotel);
                newGuest.setPrimaryKey(guestId);
                allGuestsList.add(newGuest);
            }

        } catch (SQLException exception) {
            System.out.println("Something is not worked , check your connection datas and SQL also the runner Server");
            exception.printStackTrace();
        }
    }

    /**
     * getter for all guest list
     *
     * @return list og guests in database
     */
    public List<Guest> getAllGuestsList() {
        return allGuestsList;
    }
}

