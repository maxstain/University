package org.example.university.controllers;

import org.example.university.entities.Reservation;
import org.example.university.services.reservation.IReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservation")
public class ReservationController {

    @Autowired
    IReservationService iReservationService;

    @PostMapping("/add")
    void addReservation(@RequestBody Reservation reservation) {
        iReservationService.addReservation(reservation);
    }

    @PutMapping("/update")
    void updateReservation(@RequestBody Reservation reservation) {
        iReservationService.updateReservation(reservation);
    }

    @DeleteMapping("/delete/{id}")
    void deleteReservation(@PathVariable String id) {
        iReservationService.deleteReservation(id);
    }

    @GetMapping("/reservations")
    List<Reservation> getAllReservations() {
        return iReservationService.getAllReservations();
    }

    @GetMapping("/{id}")
    Reservation getReservationById(@PathVariable String id) {
        return iReservationService.getReservationById(id);
    }

}
