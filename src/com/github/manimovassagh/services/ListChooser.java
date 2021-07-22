package com.github.manimovassagh.services;

import com.github.manimovassagh.models.persons.Person;

import java.util.Scanner;

public class ListChooser {
    private MainService mainService;

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
        System.out.println(choice);
        if (choice < 1 || choice > 4) {
            System.out.println("You entered an invalid choice, The valid range is between 1 to 4 !");
        }


    }
}
