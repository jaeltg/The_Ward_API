package com.codeclan.example.The_Ward.models.people;

public enum Speciality {
    GENERAL_DOCTOR ("General Doctor"),
    GASTROENTEROLOGIST ("Gastroenterologist"),
    DERMATOLOGIST ("Dermatologist"),
    NEUROLOGIST ("Neurologist"),
    CARDIOLOGIST ("Cardiologist"),
    PSYCHOLOGIST ("Psychologist"),
    UROLOGIST_GYNECOLOGIST("Urologynecologist");

    private String name;

    Speciality (String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
