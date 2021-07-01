package com.bootcampmeli.calculadorametrosquadrados.dtos;

import java.util.ArrayList;
import java.util.List;

import com.bootcampmeli.calculadorametrosquadrados.entities.Room;

public class RoomDTO {
    
    private String name;
    private float width;
    private float length;


    public RoomDTO() {}

    public RoomDTO(String name, float width, float length) {
        this.name = name;
        this.width = width;
        this.length = length;
    }

    public String getName() {
        return this.name;
    }

    public float getWidth() {
        return this.width;
    }

    public float getLength() {
        return this.length;
    }

    public static List<RoomDTO> convert(List<Room> rooms) {
        List<RoomDTO> roomsDTO = new ArrayList<>();

        for (Room room : rooms)
            roomsDTO.add(new RoomDTO(room.getName(), room.getWidth(), room.getLength()));

		return roomsDTO;
    }
}
