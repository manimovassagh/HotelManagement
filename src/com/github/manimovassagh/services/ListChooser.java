package com.github.manimovassagh.services;

import com.github.manimovassagh.models.buldings.*;
import com.github.manimovassagh.models.persons.Person;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;


/**
 * define a list chooser class as somehow GUI for user
 */
public class ListChooser {
    private MainService mainService;
    Map<String, Integer> roomPriceList = RoomPriceList.roomPriceGenerate();

    public ListChooser(MainService mainService) {
        this.mainService = mainService;
    }


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
            System.out.println(chosenByUser);

            if (chosenByUser.equals("1")) {
                List<Room> rooms = RoomList.getHotelRoomsList();
                Stream<Room> roomStream = rooms.stream().filter(e -> e.getSingleDouble() == SingleDouble.SINGLE).filter(e->e.getRoomType()==RoomType.NORMAL);
                System.out.println("Please Select the Room Number");
                roomStream.forEach(e -> System.out.println(e.toString()));
                Scanner roomChooser = new Scanner(System.in);
                int roomNumberForBooking = roomChooser.nextInt();
                Room bookedRoom = RoomList.getHotelRoomsList().get(roomNumberForBooking-1);
                bookedRoom.setReservationStatus(true);
                System.out.println("Good Choice! Roon Number " + roomNumberForBooking+" Is booked for you! we wish you a very nice stay at " +HotelInstance.makeHotelInstance().getNameOfBuilding());

            }
            if (chosenByUser.equals("2")) {
                //temporary
                return;

            }
            if (chosenByUser.equals("3")) {
                //temporary
                return;
            }
            if (chosenByUser.equals("4")) {
                //temporary
                return;
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
