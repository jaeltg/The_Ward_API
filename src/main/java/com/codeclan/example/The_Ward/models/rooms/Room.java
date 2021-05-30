package com.codeclan.example.The_Ward.models.rooms;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Room {

    @Column(name = "capacity")
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
