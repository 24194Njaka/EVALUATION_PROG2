package com.app;

import java.time.LocalDate;

public class Professeur {
    private int id;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String email;
    private String phone;
    private String specialty;

    public Professeur(int id, String firstName, String lastName, LocalDate birthDate,
                   String email, String phone, String specialty) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.email = email;
        this.phone = phone;
        this.specialty = specialty;
    }


    public int getId() { return id; }
}
