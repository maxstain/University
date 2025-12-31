package org.example.university.services.foyer;
import org.example.university.entities.Bloc;
import org.example.university.entities.Foyer;
import org.example.university.repositories.BlocRepository;
import org.example.university.repositories.FoyerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class FoyerServiceImpl implements IFoyerService {

    FoyerRepository foyerRepo;
    BlocRepository blocRepository;

    @Autowired
    public FoyerServiceImpl(FoyerRepository foyerRepo, BlocRepository blocRepository) {
        this.foyerRepo = foyerRepo;
        this.blocRepository = blocRepository;
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

    @Override
    public Foyer desaffecterBlocDuFoyer(long idBloc) {
        Bloc bloc = blocRepository.findById(idBloc).orElse(null);
        if (bloc != null) {
            Foyer foyer = bloc.getFoyer();
            bloc.setFoyer(null);
            blocRepository.save(bloc);
            return foyer;
        }
        return null;
    }

    @Override
    public List<Foyer> getFoyers(List<Long> numeros) {
        List<String> numerosStr = numeros.stream().map(String::valueOf).toList();
        return foyerRepo.findFoyersByChambreNumeros(numerosStr);
    }
}
