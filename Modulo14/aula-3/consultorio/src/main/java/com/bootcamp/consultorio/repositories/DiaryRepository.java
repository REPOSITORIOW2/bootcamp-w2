package com.bootcamp.consultorio.repositories;
import java.util.List;

import com.bootcamp.consultorio.entities.Diary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DiaryRepository extends JpaRepository<Diary, Long>  {
    
    @Query(value = 
        "SELECT diary.* FROM dentist d " + 
        "INNER JOIN diary ON diary.dentist_id = d.id " + 
        "WHERE d.id = :dentistId", 
        nativeQuery = true)
    List<Diary> getDiaryOfADentist(@Param("dentistId") Long dentistId);
}
