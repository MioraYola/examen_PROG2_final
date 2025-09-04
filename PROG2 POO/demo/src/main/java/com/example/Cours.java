package com.example;

public class Cours {
    private final int id; 
    private final String label; 
    private final int credit; 
    private final Enseignant enseignantDuCours;
    
    public int getId() {
        return id;
    }
    public String getLabel() {
        return label;
    }
    public int getCredit() {
        return credit;
    }
    public Enseignant getEnseignantDuCours() {
        return enseignantDuCours;
    }
    public Cours(int id, String label, int credit, Enseignant enseignantDuCours) {
        this.id = id;
        this.label = label;
        this.credit = credit;
        this.enseignantDuCours = enseignantDuCours;
    } 

    
    
}
