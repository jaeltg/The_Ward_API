package com.codeclan.example.The_Ward.models.rooms;

import com.codeclan.example.The_Ward.models.people.Patient;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.ArrayList;

@Entity
@Table(name="waiting_rooms")
public class WaitingRoom extends Room {

    @Column(name="patients")
    private ArrayList<Patient> patients;

    public WaitingRoom(int capacity){
        super(capacity);
        this.patients = new ArrayList<>();
    }

    public WaitingRoom(){

    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public void setPatients(ArrayList<Patient> patients) {
        this.patients = patients;
    }

    public void addPatientToPatients(Patient patient){
        this.patients.add(patient);
    }

    public void clearPatients(){
        this.patients.clear();
    }
}
