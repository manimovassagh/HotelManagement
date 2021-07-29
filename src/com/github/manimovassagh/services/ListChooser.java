package com.github.manimovassagh.services;

import com.github.manimovassagh.models.buldings.*;
import com.github.manimovassagh.models.persons.Guest;
import com.github.manimovassagh.models.persons.Person;

import java.util.Map;
import java.util.Scanner;


/**
 * Define a list chooser class as somehow GUI for user
 */
public class ListChooser {
    /**
     * Define a Main Service for Hotel
     */
    private MainService mainService;
    /**
     * Define a Map of Room Price List
     */
    Map<String, Integer> roomPriceList = RoomPriceList.roomPriceGenerate();

    /**
     * Use main Service in List Chooser
     * @param mainService Return Main Service
     */
    public ListChooser(MainService mainService) {
        this.mainService = mainService;
    }

    /**
     * Greeting List Chooser
     */
    public void chooseFromGreetingList() {
        Person person = mainService.getCustomers().get(0);
//        System.out.println(person);
        //initialize scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------------------------");
        System.out.println(person.getName() + " Please Select one of the Services");
        System.out.println("1)Booking\n" + "2)Checkout\n" + "3)Food Order\n" + "4)Quit\n");
        int choice;
        choice = scanner.nextInt();
//        System.out.println(choice);
        BookingSystem bookingSystem = new BookingSystem();
        if (choice < 1 || choice > 4) {
            System.out.println("You entered an invalid choice, The valid range is between 1 to 4 !");
        }
        if (choice == 1) {
            System.out.println("Please choose on of following rooms\n" +
                    "1)Normal Room Single for " + roomPriceList.get("Normal Single Room") + "€\n" +
                    "2)Normal Double Room for " + roomPriceList.get("Normal Double Room") + "€\n" +
                    "3)VIP Single Room for " + roomPriceList.get("VIP Single Room") + "€\n" +
                    "4)VIP Double Room for " + roomPriceList.get("VIP Double Room") + "€\n"
            );
            Scanner scan = new Scanner(System.in);
            String chosenByUser = scan.nextLine();


            if (chosenByUser.equals("1")) {
                bookingSystem.bookTheRoom(SingleDouble.SINGLE,RoomType.NORMAL);
            }
            if (chosenByUser.equals("2")) {
                bookingSystem.bookTheRoom(SingleDouble.DOUBLEROOM,RoomType.NORMAL);
            }
            if (chosenByUser.equals("3")) {
                bookingSystem.bookTheRoom(SingleDouble.SINGLE,RoomType.VIP);
            }
            if (chosenByUser.equals("4")) {
                bookingSystem.bookTheRoom(SingleDouble.DOUBLEROOM,RoomType.VIP);
            }



        }
        if (choice == 2) {
            System.out.println("Do you want to checkout?\n" +
                    "Please enter your room Number"

            );
        }
        if (choice == 3) {
            System.out.println("Do you want to order food?\n" +
                    "good choice !\n" + "Select from List"

            );
        }
        if (choice == 4) {
            System.out.println("Thank you for using our service?\n"

            );
        }


    }
}
