package org.example.university.repositories;

import org.example.university.entities.Foyer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoyerRepository extends CrudRepository<Foyer, Long> {
}
