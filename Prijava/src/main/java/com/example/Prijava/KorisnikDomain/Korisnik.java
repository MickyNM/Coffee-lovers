package com.example.Prijava.KorisnikDomain;

import jakarta.persistence.*;

@Entity
@Table(name = "korisnici")

public class Korisnik {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name_surname;
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName_surname() {
        return name_surname;
    }

    public void setName_surname(String name_surname) {
        this.name_surname = name_surname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Korisnik(String name_surname, String username, String password) {
        super();
        this.name_surname = name_surname;
        this.username = username;
        this.password = password;
    }

    public Korisnik() {

    }

    public Korisnik(long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Korisnik [id=" + id + ", name_surname=" + name_surname + ", username=" + username + ", password="
                + password + "]";
    }
}



