package com.example;

import java.time.LocalDateTime;

public class Examen {
    private final int id; 
    private final String titre; 
    private final Cours courRattache; 
    private final LocalDateTime dateExamen; 
    private final int coefficient; 
    private final Note noteExamen;

    public int getId() {
        return id;
    }
    public String getTitre() {
        return titre;
    }
    public Cours getCourRattache() {
        return courRattache;
    }
    public LocalDateTime getDateExamen() {
        return dateExamen;
    }
    public int getCoefficient() {
        return coefficient;
    }
    public Note getNoteExamen() {
        return noteExamen;
    }
    public Examen(int id, String titre, Cours courRattache, LocalDateTime dateExamen, int coefficient,
            Note noteExamen) {
        this.id = id;
        this.titre = titre;
        this.courRattache = courRattache;
        this.dateExamen = dateExamen;
        this.coefficient = coefficient;
        this.noteExamen = noteExamen;
    } 

    
    
}
