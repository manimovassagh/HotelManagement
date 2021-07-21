package com.github.manimovassagh.services;

import com.github.manimovassagh.models.buldings.Hotel;
import com.github.manimovassagh.models.buldings.HotelInstance;
import com.github.manimovassagh.models.persons.Guest;
import com.github.manimovassagh.models.persons.Person;

import java.util.Scanner;

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
        Person hotelGuest = new Guest();
        System.out.println("Please Enter your name");
        Scanner scanner = new Scanner(System.in);
        String givenNameByGuest = scanner.nextLine();
        System.out.println("Welcome "+givenNameByGuest+" to " + paradise.getNameOfBuilding()+" "+paradise.getAddressOfBuilding());
        System.out.println("-----------------------------");
        System.out.println("Please Select one of the options");
        System.out.println("1)Booking\n" + "2)Checkout\n" + "3)Food Order\n" + "4)Quit\n");


    }
}
