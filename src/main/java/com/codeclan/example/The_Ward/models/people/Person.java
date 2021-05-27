package com.codeclan.example.The_Ward.models.people;

public abstract class Person {


    private String name;
    private int age;
    private String photo;

    public Person(String name, int age, String photo) {
        this.name = name;
        this.age = age;
        this.photo = photo;
    }

    public Person () {

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
