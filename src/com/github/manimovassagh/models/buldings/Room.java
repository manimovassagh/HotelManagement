package com.github.manimovassagh.models.buldings;

import com.github.manimovassagh.models.persons.Guest;

public class Room {

    /**
     * specify the number of rooms
     * That works like id for our project
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
    private boolean reservationStatus = false;
    /**
     * select the type of room we have Normal or VIP
     */
    private RoomType roomType;

    /**
     * constructor to generate rooms
     * price of each room calculated automatic base on room type VIP or Normal
     *
     * @param roomNumber        number of room
     * @param singleDouble      single or double room
     * @param reservationStatus reservation status
     * @param roomType          type of the room which can be VIP or Normal --See RoomType Enum
     */
    public Room(int roomNumber, SingleDouble singleDouble, boolean reservationStatus, RoomType roomType) {
        if (roomType.equals(RoomType.NORMAL) && singleDouble.equals(SingleDouble.SINGLE)) {
            this.roomPrice = 80;
        } else if (roomType.equals(RoomType.NORMAL) && singleDouble.equals(SingleDouble.DOUBLEROOM)) {
            this.roomPrice = 99;
        } else if (roomType.equals(RoomType.VIP) && singleDouble.equals(SingleDouble.SINGLE)) {
            this.roomPrice = 140;
        } else if (roomType.equals(RoomType.VIP) && singleDouble.equals(SingleDouble.DOUBLEROOM)) {
            this.roomPrice = 180;
        }
        this.roomNumber = roomNumber;
        this.singleDouble = singleDouble;
        this.reservationStatus = reservationStatus;
        this.roomType = roomType;
    }

    /**
     * get the room number
     *
     * @return number of room
     */

    public int getRoomNumber() {
        return roomNumber;
    }

    /**
     * get room price
     *
     * @return price of room in Euro
     */
    public int getRoomPrice() {
        return roomPrice;
    }

    /**
     * get single or double type of room
     *
     * @return single or double type of room
     */
    public SingleDouble getSingleDouble() {
        return singleDouble;
    }

    /**
     * define the reservation status of room
     *
     * @return reservation status by default is false means no reserved yet
     */
    public boolean isReservationStatus() {
        return reservationStatus;
    }

    /**
     * get type of the room
     *
     * @return the type of room which is normal or vip(it defined in room type enum)
     */
    public RoomType getRoomType() {
        return roomType;
    }

    public void setReservationStatus(boolean reservationStatus) {
        this.reservationStatus = reservationStatus;
    }

    @Override
    public String toString() {
        String showReservationStatus;
        if (!reservationStatus) {
            showReservationStatus = "Not Reserved Yet";
        } else {
            showReservationStatus = "Already Reserved";
        }
        return "Hotel Rooms List{" +
                "roomNumber=" + roomNumber +
                ", singleDouble=" + singleDouble.toString().toLowerCase().trim() +
                ", roomType=" + roomType +
                ", roomPrice=" + roomPrice + "€" +
                ", reservation Status= " + showReservationStatus +
                '}';
    }
}
