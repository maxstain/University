package org.example.university.services.etudiant;

import org.example.university.entities.Etudiant;

import java.util.Date;
import java.util.List;

public interface IEtudiantService {

    public Etudiant addEtudiant(Etudiant etudiant);

    public Etudiant updateEtudiant(Etudiant etudiant);

    public void deleteEtudiant(long idEtudiant);

    public Etudiant getEtudiantById(long idEtudiant);

    public List<Etudiant> getAllEtudiants();

    List<Etudiant> getEtudiants(Date start, Date end);
}
