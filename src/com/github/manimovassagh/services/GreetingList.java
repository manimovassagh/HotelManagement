package com.github.manimovassagh.services;

import com.github.manimovassagh.models.Hotel;

public class GreetingList {
    public static void greeting() {
        Hotel paradiseHotel = new Hotel("Paradise Hotel", "Mainz", 22);
        System.out.println("Wellcome to the " + paradiseHotel.getNameOfBuilding());
        System.out.println("Our Hotel Located in " + paradiseHotel.getAddressOfBuilding() + " and we have " + paradiseHotel.getNumberOfRooms() + " rooms in our Hotel");
        System.out.println("We hope The best Stay for you journey");
        System.out.println("-----------------------------");
        System.out.println("Please Select one of the options");
        System.out.println("1)Booking\n" + "2)Checkout");


    }
}
