package com.github.manimovassagh.models.buldings;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * this is to prevent repeat in booking initializer
 * with can Book functional interface implementation and book the room method do the job
 */
public class BookingSystem implements CanBook {

    @Override
    public void bookTheRoom(SingleDouble singleDouble, RoomType roomType) {
        List<Room> rooms = RoomList.getHotelRoomsList();
        Stream<Room> roomStream = rooms.stream().filter(e -> e.getSingleDouble() == singleDouble).filter(e -> e.getRoomType() == roomType);
        System.out.println("Please Select the Room Number");
        roomStream.forEach(e -> System.out.println(e.toString()));
        Scanner roomChooser = new Scanner(System.in);
        int roomNumberForBooking = roomChooser.nextInt();
        Room bookedRoom = rooms.get(roomNumberForBooking - 1);
        rooms.get(roomNumberForBooking - 1).setReserved(true);
        System.out.println("Good Choice! Roon Number " + bookedRoom.getRoomNumber() + " Is booked for you! we wish you a very nice stay at " + HotelInstance.makeHotelInstance().getNameOfBuilding());
        rooms.forEach(System.out::println);
    }


}
