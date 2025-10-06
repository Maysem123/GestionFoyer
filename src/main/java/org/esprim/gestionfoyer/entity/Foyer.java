package org.esprim.gestionfoyer.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Foyer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFoyer;

    private String nomFoyer;

    private Long capaciteFoyer;

    @OneToOne
    @JoinColumn(name = "id_universite")
    private Universite universite;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "foyer")
    private List<Bloc> blocs;
}
