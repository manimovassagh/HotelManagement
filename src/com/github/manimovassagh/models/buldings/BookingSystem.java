package com.github.manimovassagh.models.buldings;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class BookingSystem implements CanBook {
    @Override
    public void bookTheRoom() {
        List<Room> rooms = RoomList.getHotelRoomsList();
        Stream<Room> roomStream = rooms.stream().filter(e -> e.getSingleDouble() == SingleDouble.SINGLE).filter(e -> e.getRoomType() == RoomType.NORMAL);
        System.out.println("Please Select the Room Number");
        roomStream.forEach(e -> System.out.println(e.toString()));
        Scanner roomChooser = new Scanner(System.in);
        int roomNumberForBooking = roomChooser.nextInt();
        Room bookedRoom = RoomList.getHotelRoomsList().get(roomNumberForBooking - 1);
        bookedRoom.setReservationStatus(true);
        System.out.println("Good Choice! Roon Number " + roomNumberForBooking + " Is booked for you! we wish you a very nice stay at " + HotelInstance.makeHotelInstance().getNameOfBuilding());
    }
}
