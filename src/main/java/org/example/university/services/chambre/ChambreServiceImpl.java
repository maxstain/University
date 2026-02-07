package org.example.university.services.chambre;

import lombok.extern.slf4j.Slf4j;
import org.example.university.entities.Bloc;
import org.example.university.entities.Chambre;
import org.example.university.entities.TypeChambre;
import org.example.university.repositories.BlocRepository;
import org.example.university.repositories.ChambreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@Component
public class ChambreServiceImpl implements IChambreService {

    ChambreRepository chambreRepository;
    BlocRepository blocRepository;

    @Autowired
    public ChambreServiceImpl(ChambreRepository chambreRepository, BlocRepository blocRepository) {
        this.chambreRepository = chambreRepository;
        this.blocRepository = blocRepository;
    }

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
    public Chambre getChambreById(long idChambre) {
        return chambreRepository.findById(idChambre).orElse(null);
    }

    @Override
    public List<Chambre> getAllChambres() {
        return (List<Chambre>) chambreRepository.findAll();
    }

    @Override
    @Scheduled(fixedRate = 60000)
    public void listeChambresParBloc() {
        List<Bloc> blocs = (List<Bloc>) blocRepository.findAll();
        for (Bloc bloc : blocs) {
            log.info("Bloc => {} ayant une capacité {}", bloc.getNomBloc(), bloc.getCapaciteBloc());
            if (bloc.getChambres() == null || bloc.getChambres().isEmpty()) {
                log.info("Pas de chambre disponible dans ce bloc");
            } else {
                log.info("La liste des chambres pour ce bloc:");
                for (Chambre chambre : bloc.getChambres()) {
                    log.info("NumChambre: {} type: {}", chambre.getNumeroChambre(), chambre.getTypeC());
                }
            }
            log.info("********************");
        }
    }

    @Override
    @Scheduled(fixedRate = 300000)
    public void pourcentageChambreParTypeChambre() {
        List<Chambre> chambres = (List<Chambre>) chambreRepository.findAll();
        long totalChambres = chambres.size();
        log.info("Nombre total des chambre: {}", totalChambres);

        for (TypeChambre type : TypeChambre.values()) {
            long count = chambres.stream()
                    .filter(c -> c.getTypeC().equals(type))
                    .count();
            double pourcentage = totalChambres == 0 ? 0.0 : (count * 100.0) / totalChambres;
            log.info("Le pourcentage des chambres pour le type {} est égale à {}", type, pourcentage);
        }
    }
}
