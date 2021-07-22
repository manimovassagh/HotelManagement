package com.github.manimovassagh.models.buldings;

import java.time.Year;

public abstract class Building {
    String nameOfBuilding;
    String addressOfBuilding;
    int numberOfRooms;

    /**
     * This constructor define an building object
     * @param nameOfBuilding name of building
     * @param addressOfBuilding address of building
     * @param numberOfRooms number of rooms in building
     */
    public Building(String nameOfBuilding, String addressOfBuilding, int numberOfRooms) {
        this.nameOfBuilding = nameOfBuilding;
        this.addressOfBuilding = addressOfBuilding;
        this.numberOfRooms = numberOfRooms;

    }

    /**
     * get the name of building
     * @return return name of building
     */
    public String getNameOfBuilding() {
        return nameOfBuilding;
    }

    /**
     * set name of building
     * @param nameOfBuilding name of building
     */
    public void setNameOfBuilding(String nameOfBuilding) {
        this.nameOfBuilding = nameOfBuilding;
    }

    /**
     * get address of building
     * @return address of building
     */
    public String getAddressOfBuilding() {
        return addressOfBuilding;
    }

    /**
     * set address of building
     * @param addressOfBuilding address of building
     */
    public void setAddressOfBuilding(String addressOfBuilding) {
        this.addressOfBuilding = addressOfBuilding;
    }

    /**
     * get number of rooms
     * @return number of rooms
     */
    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    /**
     * set number of rooms
     * @param numberOfRooms number of rooms
     */
    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }
}
