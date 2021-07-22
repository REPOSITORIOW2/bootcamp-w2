package com.bootcamp.consultorio.repositories;

import java.time.LocalDate;
import java.util.List;

import com.bootcamp.consultorio.entities.Patient;
import com.bootcamp.consultorio.entities.Turn;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultorioRepository extends JpaRepository<Turn, Long>{

    @Query("SELECT" + 
           " new com.bootcamp.consultorio.entities.Patient(p.id, p.name, p.last_name, p.address, p.dni, p.birth_date, p.phone, p.email)" +
           " FROM Patient p")
    List<Patient> getAllPatients();

    @Query(value = "SELECT" + 
           " p.id, p.name, p.last_name, p.address, p.dni, p.birth_date, p.phone, p.email" +
           " FROM Patient p JOIN Turn t ON p.id = t.patient_id WHERE DATE(t.day)=:day", nativeQuery = true)
    List<Object> getAllPatientsOfTheDay(@Param("day") LocalDate day);
}
