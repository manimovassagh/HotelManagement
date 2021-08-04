package com.github.manimovassagh.models.buldings;

import com.bethecoder.ascii_table.ASCIITable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * Define a Booking System to Handle Booking
 *  Use "can Book" functional interface implementation
 *  Book The Room Method Does the Main Booking Responsibility
 */
public class BookingSystem implements CanBook {
    /**
     * Initialize the Booking System
     *This booking System handle all process for Booking
     * @param singleDouble Define Single or Double Room Property
     * @param roomType Define The VIP or Normal Status for Each Room
     */
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
        RoomList list = new RoomList();
        String [] tableHeaders = { "Room Number", "Single/Double", "Normal/VIP","Price","Reservation Status"};
        String[][] tableData = list.roomListToArray(rooms);
        ASCIITable.getInstance().printTable(tableHeaders, tableData);

    }


}
