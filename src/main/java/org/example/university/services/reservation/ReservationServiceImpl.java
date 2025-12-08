package org.example.university.services.reservation;

import org.example.university.entities.Reservation;
import org.example.university.repositories.ReservationRepository;
import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Service
@Component
public class ReservationServiceImpl implements IReservationService {

    ReservationRepository reservationRepository;

    @Autowired
    public ReservationServiceImpl(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    @Override
    public Reservation addReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation updateReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public void deleteReservation(String idReservation) {
        reservationRepository.deleteById(idReservation);
    }

    @Override
    public Reservation getReservationById(Reservation reservation) {
        return reservationRepository.findById(reservation.getIdReservation()).orElse(null);
    }

    @Override
    public List<Reservation> getAllReservations(List<Reservation> reservations) {
        return (List<Reservation>) reservationRepository.findAll();
    }
}
