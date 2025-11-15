package com.app;

import java.time.LocalDateTime;

public class Examen {
    private int id;
    private String title;
    private Cours cours;
    private LocalDateTime dateTime;
    private int coefficient;

    public Examen(int id, String title, Cours cours, LocalDateTime dateTime, int coefficient) {
        this.id = id;
        this.title = title;
        this.cours = cours;
        this.dateTime = dateTime;
        this.coefficient = coefficient;
    }
    public Cours getCours() { return cours; }
    public int getCoefficient() { return coefficient; }
}
