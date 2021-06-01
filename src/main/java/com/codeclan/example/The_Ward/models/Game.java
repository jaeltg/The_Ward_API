package com.codeclan.example.The_Ward.models;

import com.codeclan.example.The_Ward.models.illness.Illness;
import com.codeclan.example.The_Ward.models.people.Name;
import com.codeclan.example.The_Ward.models.people.Patient;
import com.codeclan.example.The_Ward.models.people.Specialist;
import com.codeclan.example.The_Ward.models.people.Status;
import com.codeclan.example.The_Ward.models.rooms.WaitingRoom;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game {

    public Illness getRandomIllness(List<Illness> illnesses) {
        int randomIllnessIndex = new Random().nextInt(illnesses.size());
        return illnesses.get(randomIllnessIndex);
    }

    public String getRandomName() {
        int randomNameIndex = new Random().nextInt(Name.values().length);
        return Name.values()[randomNameIndex].getName();
    }

    public int getRandomAge(int min, int max){
        return new Random().nextInt((max - min) + 1) + min;
    }

    public int getRandomHealth(int min, int max){
        return new Random().nextInt((max - min) + 1) + min;
    }

    public Patient createRandomPatient(List<Illness> illnesses){
        String randomName = getRandomName();
        Illness randomIllness = getRandomIllness(illnesses);
        int randomAge = getRandomAge(16, 80);
        int randomHealth = getRandomHealth(60, 80);
        return new Patient(randomName, randomAge, randomIllness, randomHealth, Status.WAITING, null);
    }

//    public void addPatientToWaitingRoomIfSpace(WaitingRoom waitingRoom, List<Illness> illnesses){
//        Patient patient = createRandomPatient(illnesses, specialist);
//        if (waitingRoom.getCapacity() < waitingRoom.getPatients().size()){
//            waitingRoom.addPatientToPatients(patient);
//        }
//    }





}
