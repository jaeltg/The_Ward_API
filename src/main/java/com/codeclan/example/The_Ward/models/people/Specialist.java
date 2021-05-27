package com.codeclan.example.The_Ward.models.people;

public class Specialist extends Person{

    private Long id;
    private Speciality speciality;

    public Specialist(String name, int age, String photo, Speciality speciality) {
        super(name, age, photo);
        this.speciality = speciality;
    }

    public Specialist () {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Speciality getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }
}
