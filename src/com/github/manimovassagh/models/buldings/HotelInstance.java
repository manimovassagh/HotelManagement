package com.github.manimovassagh.models.buldings;

/**
 * This Class Make an Instance for Our Hotel
 *
 */
public final class HotelInstance {
    /**
     * Generate an Instance from Our Hotel Class
     * @return Hotel Instance
     */
    public static Hotel makeHotelInstance(){
        return new Hotel("Paradise Hotel", "Mainz", RoomList.getHotelRoomsList().size());
    }
}
