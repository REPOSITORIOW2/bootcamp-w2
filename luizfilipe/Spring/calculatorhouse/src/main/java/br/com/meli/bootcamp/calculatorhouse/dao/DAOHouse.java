package br.com.meli.bootcamp.calculatorhouse.dao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class DAOHouse {
    private String name;
    private String address;
    private List<Room> roomList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<Room> roomList) {
        this.roomList = roomList;
    }

    public Double valueHouse () {
        return this.roomList.stream().map(r -> r.squareMeter()).reduce(0.0, Double::sum) * 800;
    }

    public Double squareMeterHouse () {
        return this.roomList.stream().map(r -> r.squareMeter()).reduce(0.0, Double::sum);
    }

    public Room biggestRoom () {
        return this.roomList.stream().max(Comparator.comparing(Room::squareMeter)).orElseThrow(NoSuchElementException::new);
    }

    public List<DTORoomSize> roomSizes() {
        var ret = new ArrayList<DTORoomSize>();
        for (Room room: roomList) {
            ret.add(new DTORoomSize(room.getName(), room.squareMeter()));
        }

        return ret;
    }
}
