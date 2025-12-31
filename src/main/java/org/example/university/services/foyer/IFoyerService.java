package org.example.university.services.foyer;

import org.example.university.entities.Foyer;

import java.util.List;

public interface IFoyerService {

    public Foyer addFoyer(Foyer foyer);

    public Foyer updateFoyer(Foyer foyer);

    public void deleteFoyer(long idFoyer);

    public Foyer getFoyerById(long idFoyer);

    public List<Foyer> getAllFoyers();

    public Foyer desaffecterBlocDuFoyer(long idBloc) ;

    List<Foyer> getFoyers (List<Long> numeros);
}
