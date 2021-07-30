package com.github.manimovassagh.test;

import com.github.manimovassagh.models.buldings.RoomPriceList;

import java.util.HashMap;
import java.util.Map;

/**
 * Testing The Room Map
 */
public class Tester {
    public static void main(String[] args) {
        Map<String, Integer> roomPrice = new HashMap<>();
        roomPrice.put("Normal Single Room", 80);
        roomPrice.put("Normal Double Room", 99);
        roomPrice.put("VIP Single Room", 140);
        roomPrice.put("VIP Double Room", 180);
        System.out.println(roomPrice.get("Normal Single Room"));


    }
}
