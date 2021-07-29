package com.github.manimovassagh.models.buldings;

/**
 * Define a functional interface for booking system with "can book" contract
 */
@FunctionalInterface
public interface CanBook {
    void bookTheRoom(SingleDouble singleDouble , RoomType roomType);
}
