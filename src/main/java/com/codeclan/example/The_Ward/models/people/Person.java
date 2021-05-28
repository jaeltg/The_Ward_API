package com.codeclan.example.The_Ward.models.people;

import javax.persistence.*;

@MappedSuperclass
public abstract class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @Column(name = "name")
    private String name;

//    @Column(name = "age")
    private int age;

//    @Column(name = "photo url")
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
