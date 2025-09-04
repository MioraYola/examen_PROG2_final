package com.example;

import java.time.LocalDate;

public class Etudiant extends Personne {
    private final String groupe; 
    private final Tuteur tuteur;
    
    public String getGroupe() {
        return groupe;
    }
    public Tuteur getTuteur() {
        return tuteur;
    }
    public Etudiant(int id, String nom, String prenom, LocalDate dateNaissance, String email, String numero,
            String groupe, Tuteur tuteur) {
        super(id, nom, prenom, dateNaissance, email, numero);
        this.groupe = groupe;
        this.tuteur = tuteur;
    } 

    
}
