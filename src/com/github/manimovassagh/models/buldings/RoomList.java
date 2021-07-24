package com.github.manimovassagh.models.buldings;

import java.util.ArrayList;
import java.util.List;

public class RoomList {
    //    this is for testing the return list
//    public static void main(String[] args) {
//        List<Room> rooms = getHotelRoomsList();
//        rooms.stream().filter(e -> e.getRoomNumber() == 1).forEach(e -> e.setReservationStatus(true));
//        rooms.forEach(e -> System.out.println(e.toString()));
//
//    }

    /**
     * define the repository of our Hotel room list
     *
     * @return room list of hotel
     */

    public static List<Room> getHotelRoomsList() {
        List<Room> roomList = new ArrayList<>();
        roomList.add(new Room(1, SingleDouble.SINGLE, false, RoomType.VIP));
        roomList.add(new Room(2, SingleDouble.DOUBLEROOM, false, RoomType.VIP));
        roomList.add(new Room(3, SingleDouble.SINGLE, false, RoomType.NORMAL));
        roomList.add(new Room(4, SingleDouble.DOUBLEROOM, false, RoomType.NORMAL));
        roomList.add(new Room(5, SingleDouble.SINGLE, false, RoomType.NORMAL));
        roomList.add(new Room(6, SingleDouble.DOUBLEROOM, false, RoomType.NORMAL));
        roomList.add(new Room(7, SingleDouble.DOUBLEROOM, false, RoomType.NORMAL));
        roomList.add(new Room(8, SingleDouble.DOUBLEROOM, false, RoomType.NORMAL));
        roomList.add(new Room(9, SingleDouble.SINGLE, false, RoomType.NORMAL));
        roomList.add(new Room(10, SingleDouble.DOUBLEROOM, false, RoomType.NORMAL));
        roomList.add(new Room(11, SingleDouble.SINGLE, false, RoomType.VIP));
        roomList.add(new Room(12, SingleDouble.DOUBLEROOM, false, RoomType.VIP));
        return roomList;
    }

    public static void setReservationInList (int roomNumber,boolean reservationStatus){
        getHotelRoomsList().get(roomNumber).setReserved(reservationStatus);
    }
}
