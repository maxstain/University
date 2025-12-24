package org.example.university.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Bloc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idBloc;

    String nomBloc;

    long capaciteBloc;

    @OneToMany(mappedBy = "bloc")
    List<Chambre> chambres;

    @ManyToOne
    Foyer foyer;
}
