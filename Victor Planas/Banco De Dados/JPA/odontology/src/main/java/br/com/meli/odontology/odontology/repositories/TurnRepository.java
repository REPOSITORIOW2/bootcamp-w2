package br.com.meli.odontology.odontology.repositories;

import br.com.meli.odontology.odontology.entities.Dentist;
import br.com.meli.odontology.odontology.entities.Turn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;


@Repository
public interface TurnRepository extends JpaRepository<Turn, Long> {

    @Query("select t " +
            "From Turn t " +
            "inner join t.turnStatus ts " +
            "where ts.idTurnStatus = :status " +
            "AND (t.day = :date OR :date is null)")
    List<Turn> listAllTurnsByStatusByDate(Long status, LocalDate date);

    default List<Turn> listAllTurnsByStatus(Long status){
        return listAllTurnsByStatusByDate(status, null);
    }

    @Query("select t " +
            "From Dentist d " +
            "inner join d.diaries diaries " +
            "inner join diaries.turns t " +
            "inner join t.turnStatus ts " +
            "where ts.name = 'Reprogramado' " +
            "AND d = :dentist")
    List<Turn> listAllReescheduledByDentist(Dentist dentist);
}
