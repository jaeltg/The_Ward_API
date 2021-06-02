package com.codeclan.example.The_Ward.models.illness;

import com.codeclan.example.The_Ward.models.people.Patient;
import com.codeclan.example.The_Ward.models.people.Specialist;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="illnesses")
public class Illness {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="symptoms", length = 1000)
    private ArrayList<String> allSymptoms;

    @ManyToOne
    @JoinColumn(name = "specialist_id", nullable = false)
    @JsonIgnoreProperties({"illnesses"})
    private Specialist specialist;

    @JsonIgnoreProperties({"illness"})
    @OneToMany(mappedBy = "illness")
    private List<Patient> patientsWithIllness;

    public Illness(String name, Specialist specialist) {
        this.name = name;
        this.allSymptoms = new ArrayList<>();
        this.specialist = specialist;
        this.patientsWithIllness = new ArrayList<>();
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

    public void addSymptom(String symptom) {
        this.allSymptoms.add(symptom);
    }

    public void addAllSymptoms() {
        for (Symptom currentSymptom : Symptom.values()) {
            this.allSymptoms.add(currentSymptom.getName());
        }
    }



}
