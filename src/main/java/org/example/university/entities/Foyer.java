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
public class Foyer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idFoyer;

    String nomFoyer;

    long capaciteFoyer;

    @OneToOne(mappedBy = "foyer")
    University universite;

    @OneToMany(mappedBy = "foyer")
    List<Bloc> Blocs;
}
