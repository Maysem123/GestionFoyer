package org.esprim.gestionfoyer.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtudiant;

    private Long cin;

    private String nomET;

    private String prenomET;

    private String Ecole;

    private Date dateNaissance;




}
