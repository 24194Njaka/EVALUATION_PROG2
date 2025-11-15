package com.app;

import java.time.LocalDate;

public class Tuteur {
    private int id;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String email;
    private String phone;
    private String relation;

    public Tuteur(int id, String firstName, String lastName, LocalDate birthDate,
                 String email, String phone, String relation) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.email = email;
        this.phone = phone;
        this.relation = relation;
    }


    public int getId() { return id; }
}
