package com.github.manimovassagh.models.persons;

/**
 * This abstract class shows any living animal include human or pets
 * It is defined for later possible usage
 */
public abstract class Animal {
    /**
     * default situation of live entity
     */
    boolean isAlive = true;

    /**
     * set living status
     * @param alive is living true
     */
    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public abstract void setPrimaryKey(int guestId);
}
