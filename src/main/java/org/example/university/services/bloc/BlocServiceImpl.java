package org.example.university.services.bloc;

import org.example.university.entities.Bloc;
import org.example.university.repositories.BlocRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class BlocServiceImpl implements IBlocService {

    BlocRepository blocRepository;

    @Autowired
    public BlocServiceImpl(BlocRepository blocRepository) {
        this.blocRepository = blocRepository;
    }

    @Override
    public Bloc addBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public Bloc updateBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public void deleteBloc(long idBloc) {
        blocRepository.deleteById(idBloc);
    }

    @Override
    public Bloc getBlocById(long idBloc) {
        return blocRepository.findById(idBloc).orElse(null);
    }

    @Override
    public List<Bloc> getAllBlocs() {
        return (List<Bloc>) blocRepository.findAll();
    }
}
