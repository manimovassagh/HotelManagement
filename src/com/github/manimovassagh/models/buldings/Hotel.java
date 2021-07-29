package com.github.manimovassagh.models.buldings;

/**
 * Define our hotel class
 */
public class Hotel extends Building {


    /**
     * constructor to define a hotel
     * @param hotelName name of hotel
     * @param addressOfHotel address of hotel
     * @param numberOfRooms number of rooms in hotel
     */
    public Hotel(String hotelName, String addressOfHotel, Integer numberOfRooms) {
        super(hotelName, addressOfHotel, numberOfRooms);
    }


    /**
     * to string method to use whenever you need show things in string
     *
     * @return string details
     */
    @Override
    public String toString() {
        return "Hotel{" +
                "nameOfBuilding='" + nameOfBuilding + '\'' +
                ", addressOfBuilding='" + addressOfBuilding + '\'' +
                ", numberOfRooms=" + numberOfRooms +
                '}';
    }
}
