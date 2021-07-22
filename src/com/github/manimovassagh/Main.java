package com.github.manimovassagh;


import com.github.manimovassagh.services.GreetingList;
import com.github.manimovassagh.services.ListChooser;
import com.github.manimovassagh.services.MainService;


public class Main {
    /**
     * this is our main method which is responsible to start our program
     * @param args args
     */
    public static void main(String[] args) {
        //initialize greeting
        MainService mainService = new MainService();
        GreetingList greetingList = new GreetingList(mainService);
        greetingList.greeting();
        // initialize chooser from the list
        ListChooser listChooser = new ListChooser(mainService);
        listChooser.chooseFromGreetingList();

    }
}
