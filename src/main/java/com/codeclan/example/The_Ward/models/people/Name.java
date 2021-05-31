package com.codeclan.example.The_Ward.models.people;

public enum Name {
    JOHN("John"),
    JACK("Jack"),
    PETER("Peter"),
    PAUL("Paul"),
    MARGARET("Margaret"),
    RINGO("Ringo"),
    JONATHAN("Jonathan"),
    BORIS("Boris"),
    KAREN("Karen"),
    JANET("Janet"),
    BRIDGET("Bridget"),
    MARY("Mary"),
    LOUISE("Louise"),
    NEIL("Neil"),
    BRAD("Brad"),
    GEORGE("George"),
    FRANK("Frank"),
    ANNA("Anna"),
    MHAIRIE("Mhairie"),
    KRZYSTOF("Krzystof"),
    ABDUL("Abdul"),
    WEI("Wei"),
    PABLO ("Pablo"),
    MOHAMED ("Mohamed"),
    GILL("Gill"),
    KATE("Kate"),
    JUANA("Juana"),
    FRANCESCA("Francesca"),
    MALCOLM("Malcolm"),
    ZSOLT("Zsolt"),
    JON ("Jon");

    private String name;

    Name (String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


