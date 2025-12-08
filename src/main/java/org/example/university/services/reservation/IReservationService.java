package org.example.university.services.reservation;

import org.example.university.entities.Reservation;

import java.util.List;

public interface IReservationService {

    public Reservation addReservation(Reservation reservation);

    public Reservation updateReservation(Reservation reservation);

    public void deleteReservation(String idReservation);

    public Reservation getReservationById(Reservation reservation);

    public List<Reservation> getAllReservations(List<Reservation> reservations);
}
