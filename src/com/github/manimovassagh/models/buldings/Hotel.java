package com.github.manimovassagh.models.buldings;

/**
 * this is our hotel class
 */
public class Hotel extends Building {



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
