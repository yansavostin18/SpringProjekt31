package com.wsiiz.spring.SpringProjekt3;
import javax.persistence.*;

@Entity
public class Książka {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idKsiazka;
    private String tytul;
    private String kategoria;
    private String autor;
    private Double cena;
    @Column(length = 2048)
    private String opis;

    public Long getIdKsiazka() {
        return idKsiazka;
    }

    public String getTytul() {
        return tytul;
    }

    public String getKategoria() {
        return kategoria;
    }

    public String getAutor() {
        return autor;
    }

    public Double getCena() {
        return cena;
    }

    public String getOpis() {
        return opis;
    }

    public void setIdKsiazka(Long idKsiazka) {
        this.idKsiazka = idKsiazka;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public void setKategoria(String kategoria) {
        this.kategoria = kategoria;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setCena(Double cena) {
        this.cena = cena;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }
}


