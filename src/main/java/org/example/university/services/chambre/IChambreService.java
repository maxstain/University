package org.example.university.services.chambre;

import org.example.university.entities.Chambre;

import java.util.List;

public interface IChambreService {

    public Chambre addChambre(Chambre chambre);

    public Chambre updateChambre(Chambre chambre);

    public void deleteChambre(long idChambre);

    public Chambre getChambreById(Chambre chambre);

    public List<Chambre> getAllChambres(List<Chambre> chambres);
}
