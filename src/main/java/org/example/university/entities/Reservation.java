package org.example.university.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.sql.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Reservation {

    @Id
    String idReservation;

    Date anneUniversitaire;

    boolean estValide;

    @ManyToMany
    List<Etudiant> etudiants;
}
