package com.github.manimovassagh.services;

import com.github.manimovassagh.models.buldings.Hotel;
import com.github.manimovassagh.models.buldings.HotelInstance;
import com.github.manimovassagh.models.persons.Gender;
import com.github.manimovassagh.models.persons.Guest;
import com.github.manimovassagh.models.persons.Person;

import java.util.Scanner;

/**
 * this is our greeting part
 * we greet the user , give some information and ask name and register user inside our hotel
 */
public class GreetingList {
    private MainService mainService;

    public GreetingList(MainService mainService) {
        this.mainService = mainService;
    }


    /**
     * this is the welcome page for the user
     */
    public void greeting() {
        Hotel paradise = HotelInstance.makeHotelInstance();
        System.out.println("Welcome to the " + paradise.getNameOfBuilding());
        System.out.println("Our Hotel Located in " + paradise.getAddressOfBuilding() + " and we have " + paradise.getNumberOfRooms() + " rooms in our Hotel");
        System.out.println("We hope The best Stay for you journey");
        System.out.println("-----------------------------");
        Person hotelGuest = new Guest();
        System.out.println("Please Enter your name");
        Scanner scanner = new Scanner(System.in);
        hotelGuest.setName(scanner.nextLine());
        System.out.println("Welcome " + hotelGuest.getName() + " to " + paradise.getNameOfBuilding() + " " + paradise.getAddressOfBuilding());
        System.out.println("-----------------------------");
        System.out.println("Let us first Register you by Our registration Service");
        System.out.println("Please Enter Your family");
        hotelGuest.setFamily(scanner.nextLine());
        System.out.println("Please Enter your Gender (M/F/D)");
        String genderInput = scanner.nextLine();
        switch (genderInput) {
            case "m":
            case "M":
                hotelGuest.setGender(Gender.MALE);
                break;
            case "f":
            case "F":
                hotelGuest.setGender(Gender.FEMALE);
                break;
            case "d":
            case "D":
                hotelGuest.setGender(Gender.DIVERSE);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + genderInput);
        }
        System.out.println("Please Enter Your Age , Sorry to Ask That !");
        hotelGuest.setAge(scanner.nextInt());
        System.out.println("Very Nice. Registration is now Successfull");
        System.out.println("This is your Final Registration");
        System.out.println(hotelGuest.toString());
        mainService.addNewCustomer(hotelGuest);


    }
}
