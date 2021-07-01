package com.bootcampmeli.calculadorametrosquadrados.controllers;

import java.math.BigDecimal;
import java.util.List;

import com.bootcampmeli.calculadorametrosquadrados.dtos.HouseDTO;
import com.bootcampmeli.calculadorametrosquadrados.dtos.HouseValueDTO;
import com.bootcampmeli.calculadorametrosquadrados.dtos.RoomDTO;
import com.bootcampmeli.calculadorametrosquadrados.services.HouseService;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/houses")
public class HouseController {

    private final HouseService houseService;


    public HouseController(HouseService houseService) {
        this.houseService = houseService;
    }

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    public List<HouseDTO> getHouses() {
        return this.houseService.findAll();
    }

    @GetMapping("{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public HouseDTO getHouse(@PathVariable long id) {
        return this.houseService.findOne(id);
    }

    @GetMapping("{id}/square-meters")
    @ResponseStatus(code = HttpStatus.OK)
    public float getSquareMeters(@PathVariable long id) {
        return this.houseService.getSquareMeters(id);
    }

    @GetMapping("{id}/biggest-room")
    @ResponseStatus(code = HttpStatus.OK)
    public RoomDTO getBiggestRoom(@PathVariable long id) {
        return this.houseService.getBiggestRoom(id);
    }

    @GetMapping("{id}/value")
    @ResponseStatus(code = HttpStatus.OK)
    public HouseValueDTO getHouseValue(@PathVariable long id) {
        float squareMeters = this.houseService.getSquareMeters(id);
        BigDecimal houseValue = BigDecimal.valueOf(squareMeters * 800);

        return new HouseValueDTO(houseValue);
    }
}
