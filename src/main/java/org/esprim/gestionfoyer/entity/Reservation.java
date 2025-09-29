package org.esprim.gestionfoyer.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Reservation {
    @Id

    private String idReservation;

    private Date anneeUniversitaire;

    private boolean estValide;
}
