package org.esprim.gestionfoyer.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idUniversite;

    private String nomUniversite;

    private String adresse;

    @OneToOne(mappedBy = "universite")
    private Foyer foyer;

}
