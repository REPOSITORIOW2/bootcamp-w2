package com.bootcampmeli.calculadorametrosquadrados.dtos;

import java.util.ArrayList;
import java.util.List;

import com.bootcampmeli.calculadorametrosquadrados.entities.House;

public class HouseDTO {
    
    private String name;
    private String address;
    private List<RoomDTO> rooms;


    public HouseDTO() {}

    public HouseDTO(String name, String address, List<RoomDTO> rooms) {
        this.name = name;
        this.address = address;
        this.rooms = rooms;
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

    public List<RoomDTO> getRooms() {
        return this.rooms;
    }

	public static List<HouseDTO> convert(List<House> houses) {
        List<HouseDTO> housesDTO = new ArrayList<>();
        for (House house : houses) {
            housesDTO.add(new HouseDTO(house.getName(), house.getAddress(), RoomDTO.convert(house.getRooms())));
        }
		return housesDTO;
	}

    public static HouseDTO convert(House house) {
		return new HouseDTO(house.getName(), house.getAddress(), RoomDTO.convert(house.getRooms()));
	}
}
