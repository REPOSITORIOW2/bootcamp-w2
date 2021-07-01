package com.bootcampmeli.calculadorametrosquadrados.services;

import java.util.List;

import com.bootcampmeli.calculadorametrosquadrados.dtos.HouseDTO;
import com.bootcampmeli.calculadorametrosquadrados.dtos.RoomDTO;
import com.bootcampmeli.calculadorametrosquadrados.entities.House;
import com.bootcampmeli.calculadorametrosquadrados.interfaces.IHouseService;
import com.bootcampmeli.calculadorametrosquadrados.repository.HouseRepository;

import org.springframework.stereotype.Service;

@Service
public class HouseService implements IHouseService {

    private final HouseRepository houseRepository;


    public HouseService(HouseRepository houseRepository) {
        this.houseRepository = houseRepository;
    }

    @Override
    public List<HouseDTO> findAll() {
        List<House> houses = this.houseRepository.findAll();
        List<HouseDTO> housesDTO = HouseDTO.convert(houses);
        return housesDTO;
    }

    @Override
    public HouseDTO findOne(long id) throws RuntimeException {
        House house = this.houseRepository.findOne(id);
        HouseDTO housedDTO = HouseDTO.convert(house);
        return housedDTO;
    }

    @Override
	public float getSquareMeters(long id) throws RuntimeException {
		return this.houseRepository.getSquareMeters(id);
	}

    @Override
    public RoomDTO getBiggestRoom(long id) {
        HouseDTO house = findOne(id);
        RoomDTO biggestRoom = null;
        for(RoomDTO room : house.getRooms()) {
            Float biggestRoomArea = (biggestRoom != null) ? (biggestRoom.getWidth() * biggestRoom.getLength()) : .0f;
            Float roomArea =  room.getWidth() * room.getLength();
            if(roomArea > biggestRoomArea){
                biggestRoom = room;
            }
        }
        return (biggestRoom != null) ? biggestRoom : new RoomDTO("", .0f, .0f);
    }
}
