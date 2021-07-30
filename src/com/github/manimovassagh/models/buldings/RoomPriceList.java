package com.github.manimovassagh.models.buldings;

import java.util.HashMap;
import java.util.Map;

/**
 * Define a Price List for Each Room Type with consideration of Single Or Double
 */
public  class RoomPriceList {
    /**
     * Generate a room Price List as Map Collection
     * @return Room Price List HashMap
     */
    public static Map<String,Integer> roomPriceGenerate(){
        Map<String, Integer> roomPrice = new HashMap<>();
        roomPrice.put("Normal Single Room", 80);
        roomPrice.put("Normal Double Room", 99);
        roomPrice.put("VIP Single Room", 140);
        roomPrice.put("VIP Double Room", 180);
        return roomPrice;
    }
}
