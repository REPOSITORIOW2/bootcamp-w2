package com.bootcamp.consultorio.repositories;

import java.time.LocalDate;
import java.util.List;

import com.bootcamp.consultorio.entities.Turn;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TurnRepository extends JpaRepository<Turn, Long> {

    @Query(value = 
        "SELECT turn.* FROM turn " + 
        "INNER JOIN turn_status ts ON ts.id = turn.turn_status_id " +
        "WHERE ts.name = 'CONCLUIDO'",
        nativeQuery = true)
    List<Turn> findAllCompletedTurns();

    @Query(value = 
        "SELECT turn.* FROM turn " + 
        "INNER JOIN turn_status ts ON ts.id = turn.turn_status_id " +
        "WHERE ts.name = 'PENDENTE' AND turn.day = :day",
        nativeQuery = true)
    List<Turn> getTurnsWithPendingStatusInASpecificDay(@Param("day") LocalDate day);

    @Query(value = 
        "SELECT turn.* FROM turn " + 
        "INNER JOIN turn_status ts ON ts.id = turn.turn_status_id " +
        "INNER JOIN diary ON diary.id = turn.diary_id " +
        "INNER JOIN dentist ON dentist.id = diary.dentist_id " +
        "WHERE ts.name = 'CANCELADO' AND dentist.id = :dentistId",
        nativeQuery = true)
    List<Turn> getAllRescheduledTurns(@Param("dentistId") Long dentistId);
}