package com.example;

import java.time.Instant;

public class Examen {
    private final int id; 
    private final String titre; 
    private final Cours courRattache; 
    private final Instant dateExamen; 
    private final double coefficient; 
    private final Note noteExamen;
    private final Etudiant etudiant; 
    
    public int getId() {
        return id;
    }
    public Etudiant getEtudiant() {
        return etudiant;
    }
    public String getTitre() {
        return titre;
    }
    public Cours getCourRattache() {
        return courRattache;
    }
    public Instant getDateExamen() {
        return dateExamen;
    }
    public double getCoefficient() {
        return coefficient;
    }
    public Note getNoteExamen() {
        return noteExamen;
    }
    public Examen(int id, String titre, Cours courRattache, Instant dateExamen, double coefficient,
            Note noteExamen, Etudiant etudiant) {
        this.id = id;
        this.titre = titre;
        this.courRattache = courRattache;
        this.dateExamen = dateExamen;
        this.coefficient = coefficient;
        this.noteExamen = noteExamen;
        this.etudiant= etudiant; 
    } 

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((courRattache == null) ? 0 : courRattache.hashCode());
        result = prime * result + ((etudiant == null) ? 0 : etudiant.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Examen other = (Examen) obj;
        if (courRattache == null) {
            if (other.courRattache != null)
                return false;
        } else if (!courRattache.equals(other.courRattache))
            return false;
        if (etudiant == null) {
            if (other.etudiant != null)
                return false;
        } else if (!etudiant.equals(other.etudiant))
            return false;
        return true;
    }

    public double calculNote(){
        double total= 0; 
        return total += (noteExamen.getValeur() * coefficient)/ coefficient ;
    }

    public double getExamGrade(Examen exam, Etudiant etudiant, Instant t){
        return etudiant.getNotes().
    }
}
