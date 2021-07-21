package com.github.manimovassagh;


import com.github.manimovassagh.services.GreetingList;
import com.github.manimovassagh.services.ListChooser;


public class Main {
    /**
     * this is our main method which is responsible to start our program
     * @param args args
     */
    public static void main(String[] args) {
        //initialize greeting
        GreetingList.greeting();
        // initialize chooser from the list
        ListChooser.chooseFromGreetingList();

    }
}
