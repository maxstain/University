package org.example.university.repositories;

import org.example.university.entities.Etudiant;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface EtudiantRepository extends CrudRepository<Etudiant, Long> {
    @Query("SELECT e FROM Etudiant e JOIN e.reservations r WHERE r.anneUniversitaire BETWEEN :start AND :end")
    List<Etudiant> findEtudiantsByReservationDateBetween(@Param("start") Date start, @Param("end") Date end);
}
