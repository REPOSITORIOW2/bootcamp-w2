package com.bootcamp.consultorio.repositories;

import java.time.LocalDate;
import java.util.List;

import com.bootcamp.consultorio.entities.Dentist;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface DentistRepository extends JpaRepository<Dentist, Long>{
    
    @Query(value = 
        "SELECT d.* FROM dentist d " + 
        "INNER JOIN diary ON diary.dentist_id = d.id " + 
        "INNER JOIN turn ON turn.diary_id = diary.id " +
        "WHERE turn.day = :day " +
        "GROUP BY d.id " +
        "HAVING COUNT(d.id) >= 2", nativeQuery = true)
    List<Dentist> getAllDentistsWithMoreThanTwoTurns(@Param("day") LocalDate day);
}
