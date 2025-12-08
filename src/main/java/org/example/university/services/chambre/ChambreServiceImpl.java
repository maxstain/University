package org.example.university.services.chambre;

import org.example.university.entities.Chambre;
import org.example.university.repositories.ChambreRepository;
import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Service
@Component
public class ChambreServiceImpl implements IChambreService {

    @Autowired
    private ChambreRepository chambreRepository;


    @Override
    public Chambre addChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public Chambre updateChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public void deleteChambre(long idChambre) {
        chambreRepository.deleteById(idChambre);
    }

    @Override
    public Chambre getChambreById(Chambre chambre) {
        return chambreRepository.findById(chambre.getIdChambre()).orElse(null);
    }

    @Override
    public List<Chambre> getAllChambres(List<Chambre> chambres) {
        return (List<Chambre>) chambreRepository.findAll();
    }
}
