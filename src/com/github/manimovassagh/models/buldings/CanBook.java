package com.github.manimovassagh.models.buldings;

/**
 * this is a functional interface for booking system
 */
@FunctionalInterface
public interface CanBook {
    void bookTheRoom(SingleDouble singleDouble , RoomType roomType);
}
