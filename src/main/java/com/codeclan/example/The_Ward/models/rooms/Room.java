package com.codeclan.example.The_Ward.models.rooms;

public abstract class Room {

    private int capacity;

    public Room(int capacity){
        this.capacity = capacity;
    }

    public Room(){

    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
