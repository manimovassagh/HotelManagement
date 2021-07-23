package com.github.manimovassagh.models.persons;

import com.github.manimovassagh.models.buldings.*;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Guest extends Person {

    /**
     * constructor with number of rooms to stay
     * @param name name of guest
     * @param family family of guest
     * @param gender gender of guest
     * @param age age of guest
     * @param numberOfNightsToStay number of nights to stay
     */
    public Guest(String name, String family, Gender gender, Integer age,int numberOfNightsToStay) {
        super(name, family, gender, age);
    }

    /**
     * constructor without number of stay nights(use  later for only registration handling when guest want to
     * temporary register and not mention the nights
     * @param name name of guest
     * @param family family of guest
     * @param gender gender of guest
     * @param age age of guest
     */
    public Guest(String name, String family, Gender gender, Integer age) {
        super(name, family, gender, age);
    }

    /**
     * empty contractor in case we need in future
     */
    public Guest() {
        super();
    }


}
