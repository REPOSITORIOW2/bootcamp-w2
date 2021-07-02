package br.com.meli.bootcamp.calculatorhouse.dao;

public class DTORoom {
    private String result;
    private Room room;

    public DTORoom(String result, Room room) {
        this.result = result;
        this.room = room;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}
