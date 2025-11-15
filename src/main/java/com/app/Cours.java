package com.app;

public class Cours {
    private int id;
    private String label;
    private int credits;
    private Professeur professeur;

    public Cours(int id, String label, int credits, Professeur professeur) {
        this.id = id;
        this.label = label;
        this.credits = credits;
        this.professeur = professeur;
    }


    public int getId() { return id; }
    public int getCredits() { return credits; }
}
