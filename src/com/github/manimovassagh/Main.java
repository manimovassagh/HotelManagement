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
        //initialize Main Service Object to use as Dependency Injection argument
        MainService mainService = new MainService();
        //inject the main service in greeting
        GreetingList greetingList = new GreetingList(mainService);
        //initialize the greeting
        greetingList.greeting();
        // initialize listChooser object and inject same service inside
        ListChooser listChooser = new ListChooser(mainService);
        //initialize chooser method
        listChooser.chooseFromGreetingList();

    }
}
