package com.bootcampmeli.calculadorametrosquadrados.interfaces;

import java.util.List;

import com.bootcampmeli.calculadorametrosquadrados.entities.House;

public interface IHouseRepository {

    public List<House> findAll();
    public House findOne(long id);
    public float getSquareMeters(long id);
}
