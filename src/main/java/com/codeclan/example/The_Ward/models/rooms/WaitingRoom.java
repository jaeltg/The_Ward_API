package com.codeclan.example.The_Ward.models.rooms;

import com.codeclan.example.The_Ward.models.people.Patient;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name="waiting_rooms")
public class WaitingRoom extends Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name="patient_list")
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
