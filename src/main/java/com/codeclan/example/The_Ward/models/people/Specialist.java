package com.codeclan.example.The_Ward.models.people;

import com.codeclan.example.The_Ward.models.illness.Illness;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="specialists")
public class Specialist extends Person{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name="specialty")
    private Speciality speciality;

    @JsonIgnoreProperties({"specialist"})
    @OneToMany(mappedBy = "specialist")
    private List<Illness> illnessesToTreat;

    public Specialist(String name, int age, String photo, Speciality speciality) {
        super(name, age, photo);
        this.speciality = speciality;
    }

    public Specialist () {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Speciality getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }
}
