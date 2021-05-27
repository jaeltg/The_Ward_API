package com.codeclan.example.The_Ward.models.people;

import com.codeclan.example.The_Ward.models.illness.Illness;

public class Patient extends Person {


    private Long id;
    private Illness illness;
    private int health;
    private Status status;

    public Patient(String name, int age, String photo, Illness illness, int health, Status status) {
        super(name, age, photo);
        this.illness = illness;
        this.health = health;
        this.status = status;
    }

    public Patient() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Illness getIllness() {
        return illness;
    }

    public void setIllness(Illness illness) {
        this.illness = illness;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
