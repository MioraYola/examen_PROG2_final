package com.example;

import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Etudiant extends Personne {
    private final String groupe; 
    private final Tuteur tuteur;
    private final List<Note> notes; 
    private final List<Cours> cours; 

    public String getGroupe() {
        return groupe;
    }
    public Tuteur getTuteur() {
        return tuteur;
    }
    
    public Etudiant(int id, String nom, String prenom, LocalDate dateNaissance, String email, String numero,
            String groupe, Tuteur tuteur, List<Note> notes, List<Cours> cours) {
        super(id, nom, prenom, dateNaissance, email, numero);
        this.groupe = groupe;
        this.tuteur = tuteur;
        this.notes = new ArrayList<>();
        this.cours= new ArrayList<>();
    }
    public List<Note> getNotes() {
        return notes;
    }
    public List<Cours> getCours() {
        return cours;
    } 

    public double getCourseGrade(Cours course, Etudiant student, Instant t){
        double total=0; 
        
    }
}
