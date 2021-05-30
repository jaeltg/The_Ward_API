package com.codeclan.example.The_Ward.models.people;

public enum Status {
    WAITING ("Waiting"),
    IN_TREATMENT ("In Treatment"),
    CURED ("Cured"),
    GONE("Gone");

    private String name;

    Status (String name){
        this.name = name;
    }
}
