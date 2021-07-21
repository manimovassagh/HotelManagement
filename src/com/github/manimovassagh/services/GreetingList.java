package com.github.manimovassagh.services;

import com.github.manimovassagh.models.buldings.Hotel;
import com.github.manimovassagh.models.buldings.HotelInstance;

public class GreetingList {

    /**
     * this is the welcome page for the user
     */
    public static void greeting() {
        Hotel paradise = HotelInstance.makeHotelInstance();
        System.out.println("Welcome to the " + paradise.getNameOfBuilding());
        System.out.println("Our Hotel Located in " + paradise.getAddressOfBuilding() + " and we have " + paradise.getNumberOfRooms() + " rooms in our Hotel");
        System.out.println("We hope The best Stay for you journey");
        System.out.println("-----------------------------");
        System.out.println("Please Select one of the options");
        System.out.println("1)Booking\n" + "2)Checkout");


    }
}
