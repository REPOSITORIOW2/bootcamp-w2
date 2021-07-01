package com.bootcampmeli.calculadorametrosquadrados.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.bootcampmeli.calculadorametrosquadrados.entities.House;
import com.bootcampmeli.calculadorametrosquadrados.entities.Room;
import com.bootcampmeli.calculadorametrosquadrados.interfaces.IHouseRepository;

import org.springframework.stereotype.Repository;

@Repository
public class HouseRepository implements IHouseRepository {

    private List<House> houses = new ArrayList<>();


    public HouseRepository() {
        List<Room> rooms1 = List.of(
            new Room(10f, 5f, "Sala de Estar"),
            new Room(2f, 4f, "Cozinha"),
            new Room(5f, 5f, "Quarto")
        );

        List<Room> rooms2 = List.of(
            new Room(3f, 4f, "Hall de Entrada"),
            new Room(6f, 5f, "Escritório")
        );
        
        this.houses.add(new House("Address 1", "House 1", rooms1));
        this.houses.add(new House("Address 2", "House 2", rooms2));
    }

    @Override
    public List<House> findAll() {
        return this.getHouses();
    }

    @Override
    public House findOne(long id) throws RuntimeException {
        Optional<House> hopt = this.houses.stream().filter( x -> x.getId() == id).findFirst();
        if(hopt.isPresent()) {
            return hopt.get();
        }
        throw new RuntimeException("House of id " + id + " was not found.");
    }

    @Override
    public float getSquareMeters(long id) {
        House house = findOne(id);

        float squareMeters = 0;
        for (Room room : house.getRooms())
            squareMeters += room.getLength() * room.getWidth();

        return squareMeters;
    }

    public List<House> getHouses() {
        return this.houses;
    }
    
}
