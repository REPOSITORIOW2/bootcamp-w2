package com.bootcampmeli.calculadorametrosquadrados.interfaces;

import java.util.List;

import com.bootcampmeli.calculadorametrosquadrados.dtos.RoomDTO;
import com.bootcampmeli.calculadorametrosquadrados.dtos.HouseDTO;

public interface IHouseService {
    
    public List<HouseDTO> findAll();
    public HouseDTO findOne(long id);
    public float getSquareMeters(long id);
    public RoomDTO getBiggestRoom(long id);
}
