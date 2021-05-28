package com.codeclan.example.The_Ward.models.people;

import com.codeclan.example.The_Ward.models.illness.Illness;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="specialists")
public class Specialist extends Person{

    @Column(name="specialty")
    private Speciality speciality;

    @JsonIgnoreProperties({"specialist"})
    @OneToMany(mappedBy = "specialist")
    private List<Illness> illnessesToTreat;

    public Specialist(Name name, int age, String photo, Speciality speciality) {
        super(name, age, photo);
        this.speciality = speciality;
    }

    public Specialist () {

    }

    public Speciality getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }
}
