package org.example.university.repositories;

import org.example.university.entities.Bloc;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlocRepository extends CrudRepository<Bloc, Long> {
}
