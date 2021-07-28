package br.com.meli.odontology.odontology.repositories;

import br.com.meli.odontology.odontology.entities.Dentist;
import br.com.meli.odontology.odontology.responses.DentistSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;


@Repository
public interface DentistRepository extends JpaRepository<Dentist, Long> {

    @Query("SELECT d " +
            "FROM Dentist d " +
            "INNER JOIN d.diaries diaries " +
            "INNER JOIN diaries.turns turns " +
            "WHERE turns.day = :date " +
            "GROUP BY d " +
            "HAVING COUNT(turns) > 2")
    List<Dentist> listDentistsMoreThanTwoTurnsByDate(LocalDate date);

    @Query("select "
            + "new br.com.meli.odontology.odontology.responses.DentistSchedule(t.day, diary.startTime, diary.endingTime , p) "
            + "from Turn t "
            + "inner join t.diary diary "
            + "inner join t.patient p"
    )
    List<DentistSchedule> listAllAppointments(Dentist dentist);
}
