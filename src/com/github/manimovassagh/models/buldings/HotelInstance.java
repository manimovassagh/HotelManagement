package com.github.manimovassagh.models.buldings;

public final class HotelInstance {
    public static Hotel makeHotelInstance(){
        return new Hotel("Paradise Hotel", "Mainz", RoomList.generateHotelRoomsList().size());
    }
}
