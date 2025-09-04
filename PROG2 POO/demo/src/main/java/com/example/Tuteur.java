package com.example;

import java.time.LocalDate;

public class Tuteur extends Personne {
    private final String lienAvecEtudiant;

    public String getLienAvecEtudiant() {
        return lienAvecEtudiant;
    }

    public Tuteur(int id, String nom, String prenom, LocalDate dateNaissance, String email, String numero,
            String lienAvecEtudiant) {
        super(id, nom, prenom, dateNaissance, email, numero);
        this.lienAvecEtudiant = lienAvecEtudiant;
    } 

    
    
}
