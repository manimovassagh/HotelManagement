package com.github.manimovassagh;

import com.github.manimovassagh.models.Gender;
import com.github.manimovassagh.models.Person;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Person m = new Person("m", "n", Gender.FEMALE, 45);
        System.out.println(m.toString());
    }
}
