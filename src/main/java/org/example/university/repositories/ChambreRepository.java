package org.example.university.repositories;

import org.example.university.entities.Bloc;
import org.example.university.entities.Chambre;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChambreRepository extends CrudRepository<Chambre, Long> {
}
