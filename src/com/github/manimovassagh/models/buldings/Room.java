package com.github.manimovassagh.models.buldings;

public class Room {
    /**
     * specify the number of rooms
     */
    private int roomNumber;
    /**
     * specify the price of room
     */
    private int roomPrice;
    /**
     * specify that the room is single or double
     */
    private SingleDouble singleDouble;
    /**
     * specify the reservation status of the room
     * by default is false and means not reserved yet
     */
    private boolean resrvationStatus = false;
    /**
     * select the type of room we have
     */
    private RoomType roomType;

    public Room(int roomNumber, int roomPrice, SingleDouble singleDouble, boolean resrvationStatus, RoomType roomType) {
        this.roomNumber = roomNumber;
        this.roomPrice = roomPrice;
        this.singleDouble = singleDouble;
        this.resrvationStatus = resrvationStatus;
        this.roomType = roomType;
    }

    /**
     * get the room number
     * @return number of room
     */

    public int getRoomNumber() {
        return roomNumber;
    }

    /**
     * get room price
     * @return price of room in Euro
     */
    public int getRoomPrice() {
        return roomPrice;
    }

    /**
     * get single or double type of room
     * @return single or double type of room
     */
    public SingleDouble getSingleDouble() {
        return singleDouble;
    }

    /**
     * define the reservation status of room
     * @return reservation status by default is false means no reserved yet
     */
    public boolean isResrvationStatus() {
        return resrvationStatus;
    }

    /**
     * get type of the room
     * @See RoomType enum
     * @return the type of room which is normal or vip
     */
    public RoomType getRoomType() {
        return roomType;
    }
}
