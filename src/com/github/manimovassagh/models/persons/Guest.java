package com.github.manimovassagh.models.persons;

import com.github.manimovassagh.models.buldings.*;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Guest extends Person {

    public Guest(String name, String family, Gender gender, Integer age,int numberOfNightsToStay) {
        super(name, family, gender, age);
    }

    public Guest() {
        super();
    }


}
