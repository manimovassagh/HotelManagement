package com.github.manimovassagh.services;

import com.github.manimovassagh.models.persons.Gender;
import com.github.manimovassagh.models.persons.Person;

import static com.github.manimovassagh.models.persons.Gender.*;

public class GenderSwitcher {
    public static void genderSwitcher(String genderInput, Person hotelGuest){
        switch (genderInput) {
            case "m":
            case "M":
                hotelGuest.setGender(MALE);
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


    public static Gender genderConverter(String gender){
        Gender returnGender = null;
        if(gender.equals("m") || gender.equals("M")){
            returnGender= MALE;
        }
        if(gender.equals("f") || gender.equals("F")){
            returnGender= FEMALE;
        }
        if(gender.equals("d") || gender.equals("D")){
            returnGender = DIVERSE;
        }
        return returnGender;


    }
}
