package com.codeclan.example.The_Ward.models.illness;

import com.codeclan.example.The_Ward.models.people.Specialist;

import java.util.ArrayList;

public class Illness {

    private Long id;
    private String name;
    private ArrayList<Symptom> allSymptoms;
    private ArrayList<Symptom> visibleSymptoms;
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
}
