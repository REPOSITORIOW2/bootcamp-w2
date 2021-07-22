package com.bootcamp.demo.repository;

import com.bootcamp.demo.model.Turn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurnRepository extends JpaRepository<Turn,Long> {

}
