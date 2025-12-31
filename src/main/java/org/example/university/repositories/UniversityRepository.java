package org.example.university.repositories;

import org.example.university.entities.University;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UniversityRepository extends CrudRepository<University, Long> {
    University findByNomUniversite(String nomUniversite);

    @Query("SELECT u FROM University u JOIN u.foyer f JOIN f.Blocs b WHERE b.capaciteBloc < :capacite")
    University findUniversityByBlocCapaciteLessThan(@Param("capacite") long capacite);
}
