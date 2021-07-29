package com.github.manimovassagh.models.persons;


/**
 * This class define a Person basic attributes
 * later we will use it in different aspects like guest,manager and so on
 */
public class Person extends Animal {
    /**
     * Define name of person
     */
    String name;
    /**
     * Define family of person
     */
    String family;
    /**
     * Define gender of person
     */
    Gender gender;
    /**
     * Define age of person
     */
    Integer age;

    /**
     * This is our Person Constructor
     * @param name Define name for Each Person
     * @param family Define family for Each Person
     * @param gender Define Gender for Each Person
     * @param age Define age for Each Person
     */
    public Person(String name, String family, Gender gender, Integer age) {
        this.name = name;
        this.family = family;
        this.gender = gender;
        this.age = age;
    }

    /**
     * An Empty Constructor to use in child class
     */
    public Person() {

    }


    /**
     * get name for each Person
     * @return name of each person
     */
    public String getName() {
        return name;
    }

    /**
     * set name for each person
     * @param name of each person
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get family for each person
     * @return family of each person
     */
    public String getFamily() {
        return family;
    }

    /**
     * set family of each person
     * @param family family of each person
     */
    public void setFamily(String family) {
        this.family = family;
    }

    /**
     * get gender of each person
     * @return gender of each person
     */
    public Gender getGender() {
        return gender;
    }

    /**
     * set gender of each person
     * @param gender gender of person
     */
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    /**
     * get age of person
     * @return age of person
     */
    public Integer getAge() {
        return age;
    }

    /**
     *set age of person
     * @param age age of person
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * This method return person attributes as String
     * @return person attributes as string
     */
    @Override
    public String toString() {
        return "Guest Registration Details{" +
                "name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }

    /**
     * set primary key for each guest
     * @param guestId guest id
     */
    @Override
    public void setPrimaryKey(int guestId) {

    }
}
