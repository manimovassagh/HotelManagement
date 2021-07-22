package com.github.manimovassagh.models.buldings;

import com.github.manimovassagh.models.persons.Guest;

import java.util.ArrayList;
import java.util.List;

public class RoomList {
    //    this is for testing the return list
    public static void main(String[] args) {
        List<Room> rooms = generateHotelRoomsList();
        rooms.forEach(e -> System.out.println(e.toString()));

    }

    public static List<Room> generateHotelRoomsList() {
        Guest guest = new Guest();
        List<Room> roomList = new ArrayList<>();
        roomList.add(new Room(1,SingleDouble.SINGLE,false,RoomType.VIP));
        roomList.add(new Room(2,SingleDouble.SINGLE,false,RoomType.VIP));
        roomList.add(new Room(3,SingleDouble.SINGLE,false,RoomType.VIP));
        roomList.add(new Room(4,SingleDouble.SINGLE,false,RoomType.VIP));
        roomList.add(new Room(1,SingleDouble.SINGLE,false,RoomType.VIP));
        roomList.add(new Room(1,SingleDouble.SINGLE,false,RoomType.VIP));
        roomList.add(new Room(1,SingleDouble.SINGLE,false,RoomType.VIP));
        roomList.add(new Room(1,SingleDouble.SINGLE,false,RoomType.VIP));
        roomList.add(new Room(1,SingleDouble.SINGLE,false,RoomType.VIP));
        roomList.add(new Room(1,SingleDouble.SINGLE,false,RoomType.VIP));
        roomList.add(new Room(1,SingleDouble.SINGLE,false,RoomType.VIP));
        return roomList;
    }

}
