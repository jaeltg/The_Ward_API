package com.codeclan.example.The_Ward.models;

import com.codeclan.example.The_Ward.models.illness.Illness;
import com.codeclan.example.The_Ward.models.people.Name;
import com.codeclan.example.The_Ward.models.people.Patient;
import com.codeclan.example.The_Ward.models.people.Status;
import com.codeclan.example.The_Ward.models.rooms.WaitingRoom;

import java.util.ArrayList;
import java.util.Random;

public class Game {

    public Illness getRandomIllness(ArrayList<Illness> illnesses) {
        int randomIllnessIndex = new Random().nextInt(illnesses.size());
        return illnesses.get(randomIllnessIndex);
    }

    public Name getRandomName() {
        int randomNameIndex = new Random().nextInt(Name.values().length);
        return Name.values()[randomNameIndex];
    }

    public int getRandomAge(int min, int max){
        return new Random().nextInt((max - min) + 1) + min;
    }

    public Patient createRandomPatient(String photo, ArrayList<Illness> illnesses){
        Name randomName = getRandomName();
        Illness randomIllness = getRandomIllness(illnesses);
        int randomAge = getRandomAge(16, 99);
        return new Patient(randomName, randomAge, photo, randomIllness,20, Status.WAITING);
    }

    public void addPatientToWaitingRoomIfSpace(WaitingRoom waitingRoom, String photo, ArrayList<Illness> illnesses){
        Patient patient = createRandomPatient(photo, illnesses);
        if (waitingRoom.getCapacity() < waitingRoom.getPatients().size()){
            waitingRoom.addPatientToPatients(patient);
        }
    }





}
