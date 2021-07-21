package com.github.manimovassagh.services;

import java.util.Scanner;

public class ListChooser {
    public static void chooseFromGreetingList() {
        //initialize scanner
        Scanner scanner = new Scanner(System.in);
        int choice;
        choice = scanner.nextInt();
        System.out.println(choice);
        if (choice < 1 || choice > 4) {
            System.out.println("You entered an invalid choice, The valid range is between 1 to 4 !");
        }


    }
}
