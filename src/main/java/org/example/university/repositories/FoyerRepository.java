package org.example.university.repositories;

import org.example.university.entities.Foyer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FoyerRepository extends CrudRepository<Foyer, Long> {
    @Query("SELECT DISTINCT f FROM Foyer f JOIN f.Blocs b JOIN b.chambres c WHERE c.numeroChambre IN :numeros")
    List<Foyer> findFoyersByChambreNumeros(@Param("numeros") List<String> numeros);
}
