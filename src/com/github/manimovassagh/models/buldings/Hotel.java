package com.github.manimovassagh.models.buldings;

/**
 * this is our hotel class
 */
public class Hotel extends Building {

    public static int[] roomList = {1,2,3,4,5,6,7,8,9,10};

    public Hotel(String hotelName, String addressOfHotel, Integer numberOfRooms) {
        super(hotelName, addressOfHotel, numberOfRooms);
    }

    @Override
    public int getNumberOfRooms() {
        return roomList.length;
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
