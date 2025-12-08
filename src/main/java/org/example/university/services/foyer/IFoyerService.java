package org.example.university.services.foyer;

import org.example.university.entities.Foyer;

import java.util.List;

public interface IFoyerService {

    public Foyer addFoyer(Foyer foyer);

    public Foyer updateFoyer(Foyer foyer);

    public void deleteFoyer(long idFoyer);

    public Foyer getFoyerById(Foyer foyer);

    public List<Foyer> getAllFoyers();
}
