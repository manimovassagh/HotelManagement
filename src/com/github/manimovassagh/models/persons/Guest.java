package com.github.manimovassagh.models.persons;

import com.github.manimovassagh.models.buldings.*;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * define the guest of hotel
 */
public class Guest extends Person {
    int numberOfNightsToStay;
    int bookedRoomNumber;



    /**
     * constructor with number of rooms to stay
     *
     * @param name                 name of guest
     * @param family               family of guest
     * @param gender               gender of guest
     * @param age                  age of guest
     * @param numberOfNightsToStay number of nights to stay
     */
    public Guest(String name, String family, Gender gender, Integer age, int numberOfNightsToStay) {
        super(name, family, gender, age);
        this.numberOfNightsToStay = numberOfNightsToStay;
    }

    /**
     * constructor without number of stay nights(use  later for only registration handling when guest want to
     * temporary register and not mention the nights
     *
     * @param name   name of guest
     * @param family family of guest
     * @param gender gender of guest
     * @param age    age of guest
     */
    public Guest(String name, String family, Gender gender, Integer age) {
        super(name, family, gender, age);
    }

    /**
     *  An Empty contractor in case we need in future
     */
    public Guest() {
        super();
    }

    /**
     * Get the number of nights stays for guest
     *
     * @return number of nights stay
     */
    public int getNumberOfNightsToStay() {
        return numberOfNightsToStay;
    }

    /**
     * Set the number of stays in hotel
     *
     * @param numberOfNightsToStay number of stays in hotel
     */

    public void setNumberOfNightsToStay(int numberOfNightsToStay) {
        this.numberOfNightsToStay = numberOfNightsToStay;
    }

    /**
     * Get Booked Rooms Number
     * @return booked room number
     */
    public int getBookedRoomNumber() {
        return bookedRoomNumber;
    }

    /**
     * Generate String from our Guest Class
     * @return String og Guest
     */
    @Override
    public String toString() {
        return "Guest{" +
                "  name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", numberOfNightsToStay is " + numberOfNightsToStay + " Nights" +
                '}';
    }


}
