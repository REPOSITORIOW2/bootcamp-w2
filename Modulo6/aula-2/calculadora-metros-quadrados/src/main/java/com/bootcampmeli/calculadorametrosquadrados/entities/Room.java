package com.bootcampmeli.calculadorametrosquadrados.entities;

public class Room {

    private Float width;
    private Float length;
    private String name;

    
    public Room() {}

    public Room(Float width, Float length, String name) {
        this.width = width;
        this.length = length;
        this.name = name;
    }

    public Float getWidth() {
        return this.width;
    }

    public Float getLength() {
        return this.length;
    }

    public String getName() {
        return this.name;
    }
}
