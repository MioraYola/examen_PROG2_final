package com.example;

import java.time.LocalDate;

public class Enseignant extends Personne {
    private final String specialite;

    public String getSpecialite() {
        return specialite;
    }

    public Enseignant(int id, String nom, String prenom, LocalDate dateNaissance, String email, String numero,
            String specialite) {
        super(id, nom, prenom, dateNaissance, email, numero);
        this.specialite = specialite;
    } 

    
    
}
