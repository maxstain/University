package org.example.university.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class University {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idUniversite;

    String nomUniversite;

    String adresse;

    @OneToOne(cascade = CascadeType.ALL)
    Foyer foyer;
}
