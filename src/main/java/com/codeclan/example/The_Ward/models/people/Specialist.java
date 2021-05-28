package com.codeclan.example.The_Ward.models.people;
import com.codeclan.example.The_Ward.models.illness.Illness;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "specialists")
public class Specialist extends Person{

    @Column(name = "speciality")
    private String speciality;

    @JsonIgnoreProperties(value = "specialist")
    @OneToMany(mappedBy = "specialist", fetch = FetchType.LAZY)
    private List<Illness> illnesses;

    public Specialist(String name, int age, String photo, String speciality) {
        super(name, age, photo);
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

    public List<Illness> getIllnesses() { return illnesses; }

    public void setIllnesses(List<Illness> illnesses) {
        this.illnesses = illnesses;
    }

    }
