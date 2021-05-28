package com.codeclan.example.The_Ward.models.illness;

import com.codeclan.example.The_Ward.models.people.Specialist;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name="illnesses")
public class Illness {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="symptoms")
    private ArrayList<Symptom> allSymptoms;

    @Column(name="visible_symptoms")
    private ArrayList<Symptom> visibleSymptoms;

    @ManyToOne
    @JoinColumn(name = "specialist_id", nullable = false)
    @JsonIgnoreProperties({"illnesses"})
    private Specialist specialist;

    public Illness(String name, Specialist specialist) {
        this.name = name;
        this.allSymptoms = new ArrayList<>();
        this.visibleSymptoms = new ArrayList<>();
        this.specialist = specialist;
    }

    public Illness() {

    }

    public Specialist getSpecialist() {
        return specialist;
    }

    public void setSpecialist(Specialist specialist) {
        this.specialist = specialist;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Symptom> getAllSymptoms() {
        return allSymptoms;
    }

    public void setAllSymptoms(ArrayList<Symptom> allSymptoms) {
        this.allSymptoms = allSymptoms;
    }

    public ArrayList<Symptom> getVisibleSymptoms() {
        return visibleSymptoms;
    }

    public void setVisibleSymptoms(ArrayList<Symptom> visibleSymptoms) {
        this.visibleSymptoms = visibleSymptoms;
    }

    public void addSymptom(Symptom symptom) {
        this.allSymptoms.add(symptom);
    }

    public void addAllSymptoms() {
        for (Symptom currentSymptom : Symptom.values()) {
            this.allSymptoms.add(currentSymptom);
        }
    }



}
