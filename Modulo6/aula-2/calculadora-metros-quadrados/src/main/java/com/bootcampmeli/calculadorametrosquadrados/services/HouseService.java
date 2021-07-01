package com.bootcampmeli.calculadorametrosquadrados.services;

import java.util.List;

import com.bootcampmeli.calculadorametrosquadrados.dtos.HouseDTO;
import com.bootcampmeli.calculadorametrosquadrados.dtos.RoomDTO;
import com.bootcampmeli.calculadorametrosquadrados.entities.House;
import com.bootcampmeli.calculadorametrosquadrados.repository.HouseRepository;

import org.springframework.stereotype.Service;

//Error creating bean with name 'houseController': Unsatisfied dependency expressed through field 'houseService'; nested exception is org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'houseService' defined in file [/Users/bwaldvogel/Documents/Dev/bootcamp-w2/Modulo6/aula-2/calculadora-metros-quadrados/target/classes/com/bootcampmeli/calculadorametrosquadrados/services/HouseService.class]: Unsatisfied dependency expressed through constructor parameter 0; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'houseRepository' defined in file [/Users/bwaldvogel/Documents/Dev/bootcamp-w2/Modulo6/aula-2/calculadora-metros-quadrados/target/classes/com/bootcampmeli/calculadorametrosquadrados/repository/HouseRepository.class]: Instantiation of bean failed; nested exception is org.springframework.beans.BeanInstantiationException: Failed to instantiate [com.bootcampmeli.calculadorametrosquadrados.repository.HouseRepository]: Constructor threw exception; nested exception is java.lang.NullPointerException

@Service
public class HouseService {

    private final HouseRepository houseRepository;

    public HouseService() {
        this.houseRepository = new HouseRepository();
    }

    public static void main(String[] args) {
        HouseService houseService = new HouseService();
    }

    public HouseService(HouseRepository houseRepository) {
        this.houseRepository = houseRepository;
    }

    public List<HouseDTO> findAll() {
        List<House> houses = this.houseRepository.findAll();
        List<HouseDTO> housesDTO = HouseDTO.convert(houses);
        return housesDTO;
    }

    public HouseDTO findOne(long id) {
        House house = this.houseRepository.findOne(id);
        HouseDTO housedDTO = HouseDTO.convert(house);
        return housedDTO;
    }

	public float getSquareMeters(long id) {
		return this.houseRepository.getSquareMeters(id);
	}

    public RoomDTO getBiggestRoom(long id) {
        HouseDTO house = findOne(id);
        RoomDTO biggestRoom = null;
        for(RoomDTO room : house.getRooms()) {
            Float biggestRoomArea = biggestRoom.getWidth() * biggestRoom.getLength();
            Float roomArea =  room.getWidth() * room.getLength();
            if(roomArea > biggestRoomArea){
                biggestRoom = room;
            }
        }
        return (biggestRoom != null) ? biggestRoom : new RoomDTO();
    }
}
