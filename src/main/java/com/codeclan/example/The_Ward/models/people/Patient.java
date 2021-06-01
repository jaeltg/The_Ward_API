package com.codeclan.example.The_Ward.models.people;

import com.codeclan.example.The_Ward.models.illness.Illness;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name="patients")
public class Patient extends Person {

    @ManyToOne
    @JoinColumn(name = "illness_id")
    @JsonIgnoreProperties({"patients"})
    private Illness illness;

    @Column(name = "health")
    private int health;

    @Column(name="status")
    private Status status;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "specialist_id")
    @JsonIgnoreProperties({"patients"})
    private Specialist treatingSpecialist;

    public Patient(String name, int age, Illness illness, int health, Status status, Specialist treatingSpecialist) {
        super(name, age);
        this.illness = illness;
        this.health = health;
        this.status = status;
        this.treatingSpecialist = treatingSpecialist;
    }

    public Patient() {

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

    public Specialist getTreatingSpecialist() {
        return treatingSpecialist;
    }

    public void setTreatingSpecialist(Specialist treatingSpecialist) {
        this.treatingSpecialist = treatingSpecialist;
    }
}
