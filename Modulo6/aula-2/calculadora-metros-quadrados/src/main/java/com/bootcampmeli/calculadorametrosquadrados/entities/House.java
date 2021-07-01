package com.bootcampmeli.calculadorametrosquadrados.entities;

import java.util.ArrayList;
import java.util.List;

public class House {

    private String name;
    private String address;
    private List<Room> rooms;
    private static Long universalId = 0L;
    private Long id;

    
    public House() {
        this.name = "";
        this.address = "";
        this.rooms = new ArrayList<>();
        this.id = universalId++;
    }

    public House(String address, String name, List<Room> rooms) {
        this.name = name;
        this.address = address;
        this.rooms = rooms;
        this.id = universalId++;
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Room> getRooms() {
        return this.rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

}
