
//progettare una piattaforma, esposta tramite servizi reset, realizzati tramite spring
//che permetta di memorizzare un elenco di film(titolo,anno,regista,tipo incasso) e di effettuare una ricerca per regista.

//Dettagli tecnici:
//l'applicazione deve essere realizzata tramite spring
//l'incasso sul database deve essere criptato
//documentare il metodo del dao del film che effettua la ricerca tramite java api
//documentare tramite swagger il servizio reset




package com.netflix.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Film {
 @Id
 private int id;

 @Column(name="TITOLO")
 private String titolo;

 @Column(name="ANNO")
 private int anno;

 @Column(name="REGISTA")
 private String regista;

 @Column(name="INCASSO")
 private  int incasso;

    public int getId() {
        return id;
    }

    public String getTitolo() {
        return titolo;
    }

    public int getAnno() {
        return anno;
    }

    public String getRegista() {
        return regista;
    }

    public int getIncasso() {
        return incasso;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public void setRegista(String regista) {
        this.regista = regista;
    }

    public void setIncasso(int incasso) {
        this.incasso = incasso;
    }


}
