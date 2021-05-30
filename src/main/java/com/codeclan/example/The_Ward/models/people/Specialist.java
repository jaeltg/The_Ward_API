package com.codeclan.example.The_Ward.models.people;
import com.codeclan.example.The_Ward.models.illness.Illness;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.codeclan.example.The_Ward.models.illness.Illness;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="specialists")
public class Specialist extends Person{

    @Column(name="specialty")
    private String speciality;

    @JsonIgnoreProperties({"specialist"})
    @OneToMany(mappedBy = "specialist")
    private List<Illness> illnessesToTreat;

    public Specialist(String name, int age, String speciality) {
        super(name, age);
        this.speciality = speciality;
    }

    public Specialist () {

    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public List<Illness> getIllnesses() { return illnessesToTreat; }

    public void setIllnesses(List<Illness> illnesses) {
        this.illnessesToTreat = illnesses;
    }

    }
