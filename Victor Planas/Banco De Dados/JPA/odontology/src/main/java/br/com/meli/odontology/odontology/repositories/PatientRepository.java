package br.com.meli.odontology.odontology.repositories;

import br.com.meli.odontology.odontology.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

    @Query("SELECT distinct p "+
    "FROM Patient p "+
    "INNER JOIN p.turns turns "+
    "WHERE turns.day = :date")
    List<Patient> findAllByDate(LocalDate date);


}
