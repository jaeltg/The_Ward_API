package com.codeclan.example.The_Ward.models.illness;

import com.codeclan.example.The_Ward.models.people.Specialist;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import java.util.ArrayList;
import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "illnesses")
public class Illness implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

//    @Column(name = "allSymptoms")
    private ArrayList<String> allSymptoms;

//    @Column(name = "visibleSymptoms")
    private ArrayList<String> visibleSymptoms;

    @JsonIgnoreProperties(value = "illnesses")
    @ManyToOne
    @JoinColumn(name = "specialist_id", nullable = false)
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

    public ArrayList<String> getAllSymptoms() {
        return allSymptoms;
    }

    public void setAllSymptoms(ArrayList<String> allSymptoms) {
        this.allSymptoms = allSymptoms;
    }

    public ArrayList<String> getVisibleSymptoms() {
        return visibleSymptoms;
    }

    public void setVisibleSymptoms(ArrayList<String> visibleSymptoms) {
        this.visibleSymptoms = visibleSymptoms;
    }

    public void addSymptom(String symptom) {
        this.allSymptoms.add(symptom);
    }

    public void addAllSymptoms() {
        for (Symptom currentSymptom : Symptom.values()) {
            this.allSymptoms.add(currentSymptom.getValue());
        }
    }



}
