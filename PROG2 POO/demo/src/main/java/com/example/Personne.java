package com.example;

import java.time.LocalDate;

public class Personne {
    private final int id; 
    private final String nom; 
    private final String prenom; 
    private final LocalDate dateNaissance; 
    private final String email; 
    private final String numero;
    
    public int getId() {
        return id;
    }
    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public LocalDate getDateNaissance() {
        return dateNaissance;
    }
    public String getEmail() {
        return email;
    }
    public String getNumero() {
        return numero;
    }
    public Personne(int id, String nom, String prenom, LocalDate dateNaissance, String email, String numero) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.email = email;
        this.numero = numero;
    } 

    
}
