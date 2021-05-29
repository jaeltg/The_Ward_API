package com.codeclan.example.The_Ward.models.rooms;

import com.codeclan.example.The_Ward.models.people.Patient;

import java.util.ArrayList;

public class WaitingRoom extends Room {

    private Long id;
    private ArrayList<Patient> patientList;

    public WaitingRoom(int capacity){
        super(capacity);
        this.patientList = new ArrayList<>();
    }

    public WaitingRoom(){

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
