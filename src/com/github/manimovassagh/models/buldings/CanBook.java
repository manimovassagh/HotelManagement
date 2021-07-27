package com.github.manimovassagh.models.buldings;

/**
 * this is a functional interface for booking system with can book contract
 */
@FunctionalInterface
public interface CanBook {
    void bookTheRoom(SingleDouble singleDouble , RoomType roomType);
}
