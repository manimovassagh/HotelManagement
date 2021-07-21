package com.github.manimovassagh.models;

import java.time.Year;

public class Building {
    String nameOfBuilding;
    String addressOfBuilding;
    int numberOfRooms;


    public Building(String nameOfBuilding, String addressOfBuilding, int numberOfRooms) {
        this.nameOfBuilding = nameOfBuilding;
        this.addressOfBuilding = addressOfBuilding;
        this.numberOfRooms = numberOfRooms;

    }

    public String getNameOfBuilding() {
        return nameOfBuilding;
    }

    public void setNameOfBuilding(String nameOfBuilding) {
        this.nameOfBuilding = nameOfBuilding;
    }

    public String getAddressOfBuilding() {
        return addressOfBuilding;
    }

    public void setAddressOfBuilding(String addressOfBuilding) {
        this.addressOfBuilding = addressOfBuilding;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }
}
