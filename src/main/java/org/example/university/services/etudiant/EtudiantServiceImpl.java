package org.example.university.services.etudiant;

import org.example.university.entities.Etudiant;
import org.example.university.repositories.EtudiantRepository;
import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Service
@Component
public class EtudiantServiceImpl implements IEtudiantService {

    EtudiantRepository etRepo;

    @Autowired
    public EtudiantServiceImpl(EtudiantRepository etRepo) {
        this.etRepo = etRepo;
    }

    @Override
    public Etudiant addEtudiant(Etudiant etudiant) {
        return etRepo.save(etudiant);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant etudiant) {
        return etRepo.save(etudiant);
    }

    @Override
    public void deleteEtudiant(long idEtudiant) {
        etRepo.deleteById(idEtudiant);
    }

    @Override
    public Etudiant getEtudiantById(long idEtudiant) {
        return etRepo.findById(idEtudiant).orElse(null);
    }

    @Override
    public List<Etudiant> getAllEtudiants() {
        return (List<Etudiant>) etRepo.findAll();
    }
}
