package com.github.manimovassagh.services;

import com.github.manimovassagh.models.persons.Gender;
import com.github.manimovassagh.models.persons.Person;

public class GenderSwitcher {
    public static void genderSwitcher(String genderInput, Person hotelGuest){
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
                System.out.println("please enter a valid Gender Type m or f or d");

        }
    }
}
