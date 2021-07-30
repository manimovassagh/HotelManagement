package com.github.manimovassagh.test;

import com.github.manimovassagh.models.databaseconnection.GuestReaderFromDatabaseJDBC;

/**
 * Testing The Database Connector Component
 */
public class DatabaseConnectorTester {
    public static void main(String[] args) {
        //testing the class for reading database
        GuestReaderFromDatabaseJDBC reader = new GuestReaderFromDatabaseJDBC();
        reader.readGuestTableFromDatabase();
        reader.getAllGuestsList().forEach(System.out::println);

    }
}
