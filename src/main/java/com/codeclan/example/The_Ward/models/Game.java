package com.codeclan.example.The_Ward.models;

import com.codeclan.example.The_Ward.models.illness.Illness;
import com.codeclan.example.The_Ward.models.people.Name;

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

//    public int getRandomAge(){
//        int
//    }
}
