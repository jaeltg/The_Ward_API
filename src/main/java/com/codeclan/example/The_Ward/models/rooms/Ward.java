package com.codeclan.example.The_Ward.models.rooms;

import com.codeclan.example.The_Ward.models.people.Patient;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name="wards")
public class Ward extends Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name="patient_list")
    private ArrayList<Patient> patientList;

    public Ward(int capacity){
        super(capacity);
        this.patientList = new ArrayList<>();
    }

    public Ward(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }

    public void addPatientToPatientList(Patient patient){
        this.patientList.add(patient);
    }

    public void clearPatientList(){
        this.patientList.clear();
    }
}
