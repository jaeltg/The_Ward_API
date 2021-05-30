package com.codeclan.example.The_Ward.models.rooms;

import com.codeclan.example.The_Ward.models.people.Patient;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.ArrayList;


@Entity
@Table(name="wards")
public class Ward extends Room{

    @Column(name="patients")
    private ArrayList<Patient> patients;

    public Ward(int capacity) {
        super(capacity);
        this.patients = new ArrayList<>();
    }

    public Ward(){

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
