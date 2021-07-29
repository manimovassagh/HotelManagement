package com.github.manimovassagh.services;

import com.github.manimovassagh.models.persons.Gender;
import com.github.manimovassagh.models.persons.Person;

import static com.github.manimovassagh.models.persons.Gender.*;

/**
 * This Class evaluate the input gender by user
 */
public class GenderSwitcher {
    /**
     * This method is a Gender Switcher to handle gender Input by User
     * @param genderInput gender Input by User
     * @param hotelGuest Hotel Guest
     */
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

    /**
     * This method check the return value from database and converted to our gender enum
     * @param gender Gender value which return from database
     * @return Gender value in our enum format
     */
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
