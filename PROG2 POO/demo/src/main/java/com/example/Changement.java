package com.example;

import java.time.LocalDateTime;

public class Changement {
    private final String description; 
    private final LocalDateTime heureChangement; 
    private final boolean effectueOuNon; 


    public void changementEffectué(){
        if ( this.effectueOuNon==true) {
            System.out.println("Une modification a été apporté sur cette note " );

        }
    }


    public String getDescription() {
        return description;
    }


    public LocalDateTime getHeureChangement() {
        return heureChangement;
    }


    public boolean isEffectueOuNon() {
        return effectueOuNon;
    }


    public Changement(String description, LocalDateTime heureChangement, boolean effectueOuNon) {
        this.description = description;
        this.heureChangement = heureChangement;
        this.effectueOuNon = effectueOuNon;
    }

    
}