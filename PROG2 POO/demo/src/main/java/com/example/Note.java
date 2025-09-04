package com.example;

import java.util.ArrayList;
import java.util.List;

import com.Changement;

public class Note {
    private final double valeur; 
    private List<Changement> changement = new ArrayList<>();

    
    public double getValeur() {
        return valeur;
    }


    public List<Changement> getChangement() {
        return changement;
    }


    public void setChangement(List<Changement> changement) {
        this.changement = changement;
    }


    public Note(double valeur, List<Changement> changement) {
        this.valeur = valeur;
        this.changement = changement;
    } 


}
