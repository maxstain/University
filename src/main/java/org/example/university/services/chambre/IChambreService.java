package org.example.university.services.chambre;

import org.example.university.entities.Chambre;

import java.util.List;

public interface IChambreService {

    public Chambre addChambre(Chambre chambre);

    public Chambre updateChambre(Chambre chambre);

    public void deleteChambre(long idChambre);

    public Chambre getChambreById(long idChambre);

    public List<Chambre> getAllChambres();

    void listeChambresParBloc();

    void pourcentageChambreParTypeChambre();
}
