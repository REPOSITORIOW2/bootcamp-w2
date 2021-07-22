package com.bootcamp.consultorio.repositories;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import com.bootcamp.consultorio.entities.Patient;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

    @Query("SELECT p FROM Patient p")
    List<Patient> getAllPatients();

    @Query("SELECT p FROM Patient p JOIN Turn t WHERE DATE(t.day) = DATE(:day)")
    List<Patient> getAllPatientsOfTheDay(@Param("day") Date day);

    @Query(value = "SELECT DISTINCT" + 
    " p.id, p.name, p.last_name, p.address, p.dni, p.birth_date, p.phone, p.email" +
    " FROM Patient p JOIN Turn t ON p.id = t.patient_id WHERE t.day=:day", nativeQuery = true)
    List<Patient> getAllPatientsOfTheDay(@Param("day") LocalDate day);

    
}
