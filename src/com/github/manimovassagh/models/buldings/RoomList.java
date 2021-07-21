package com.github.manimovassagh.models.buldings;

import com.github.manimovassagh.services.ListChooser;

import java.util.ArrayList;
import java.util.List;

public class RoomList {
//    this is for testing the return list
    public static void main(String[] args) {
        List<Room> rooms=generateHotelRoomsList();
        rooms.forEach(e-> System.out.println(e.getRoomNumber()));
        rooms.forEach(e-> System.out.println(e.getRoomPrice()));
        rooms.forEach(e-> System.out.println(e.getRoomType()));
        rooms.forEach(e-> System.out.println(e.getSingleDouble()));
    }

    public static List<Room> generateHotelRoomsList (){
        List<Room> roomList = new ArrayList<>();
        roomList.add(new Room(1,100,SingleDouble.DOUBLE,false,RoomType.NORMAL));
        return roomList;
    }

}
