package org.example.university.services.etudiant;

import org.example.university.entities.Etudiant;

import java.util.List;

public interface IEtudiantService {

    public Etudiant addEtudiant(Etudiant etudiant);

    public Etudiant updateEtudiant(Etudiant etudiant);

    public void deleteEtudiant(long idEtudiant);

    public Etudiant getEtudiantById(Etudiant etudiant);

    public List<Etudiant> getAllEtudiants();
}
