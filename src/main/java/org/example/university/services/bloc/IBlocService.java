package org.example.university.services.bloc;

import org.example.university.entities.Bloc;

import java.util.List;

public interface IBlocService {

    public Bloc addBloc(Bloc bloc);

    public Bloc updateBloc(Bloc bloc);

    public void deleteBloc(long idBloc);

    public Bloc getBlocById(Bloc bloc);

    public List<Bloc> getAllBlocs(List<Bloc> blocs);
}
