package br.com.meli.bootcamp.calculatorhouse.dao;

import java.util.Comparator;

public class Room {
    private String name;
    private Double width;
    private Double length;

    public Room(String name, Double width, Double length) {
        this.name = name;
        this.width = width;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double squareMeter() {
        return this.length * this.width;
    }
}
