package com.github.manimovassagh.test;

import com.github.manimovassagh.models.databaseconnection.GuestWriterToDatabaseJDBC;
import com.github.manimovassagh.models.persons.Gender;
import com.github.manimovassagh.models.persons.Guest;

import java.util.ArrayList;
import java.util.List;

/**
 * Testing The database Writer Component
 */
public class DatabaseWriterTest {
    public static void main(String[] args) {
        Guest testGuest = new Guest("David", "Titchfiled", Gender.MALE, 55, 7);
        List<Guest> testWriterArray = new ArrayList<>();
        testWriterArray.add(testGuest);
        testWriterArray.add(new Guest("Mehdi", "rahmaniayan", Gender.MALE, 44, 3));
        testWriterArray.add(new Guest("mahshid", "froh", Gender.FEMALE, 45, 5));
        GuestWriterToDatabaseJDBC writer = new GuestWriterToDatabaseJDBC();
        writer.writerToDatabase(testGuest);
        writer.addGuest(testGuest);
        testWriterArray.forEach(writer::writerToDatabase);

    }
}
