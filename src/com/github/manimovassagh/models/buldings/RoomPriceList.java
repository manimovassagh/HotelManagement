package com.github.manimovassagh.models.buldings;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public  class RoomPriceList {
    public static Map<String,Integer> roomPriceGenerate(){
        Map<String, Integer> roomPrice = new HashMap<>();
        roomPrice.put("Normal Single Room", 80);
        roomPrice.put("Normal Double Room", 99);
        roomPrice.put("VIP Single Room", 140);
        roomPrice.put("VIP Double Room", 180);
        return roomPrice;
    }
}
