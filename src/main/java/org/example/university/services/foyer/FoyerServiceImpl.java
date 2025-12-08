package org.example.university.services.foyer;

import org.example.university.entities.Foyer;
import org.example.university.repositories.FoyerRepository;
import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Service
@Component
public class FoyerServiceImpl implements IFoyerService {

    FoyerRepository foyerRepo;

    @Autowired
    public FoyerServiceImpl(FoyerRepository foyerRepo) {
        this.foyerRepo = foyerRepo;
    }

    @Override
    public Foyer addFoyer(Foyer foyer) {
        return foyerRepo.save(foyer);
    }

    @Override
    public Foyer updateFoyer(Foyer foyer) {
        return foyerRepo.save(foyer);
    }

    @Override
    public void deleteFoyer(long idFoyer) {
        foyerRepo.deleteById(idFoyer);
    }

    @Override
    public Foyer getFoyerById(long idFoyer) {
        return foyerRepo.findById(idFoyer).orElse(null);
    }

    @Override
    public List<Foyer> getAllFoyers() {
        return (List<Foyer>) foyerRepo.findAll();
    }
}
