package simplon.co.ecf_hopital.persistance.entity;

import jakarta.persistence.*;
import simplon.co.ecf_hopital.business.dto.LitDto;

import java.util.Date;

@Entity
@Table(name = "patient")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nom")
    private String nom;
    @Column(name = "prenom")
    private String prenom;
    @Column(name = "numsecuritesocial")
    private int numSecuriteSocial;
    @Column(name = "edate")
    private Date edate;
    @Column(name = "sdate")
    private Date sdate;
    @OneToOne
    @JoinColumn(name = "idlit")
    private Lit lit;

    public Lit getLit() {
        return lit;
    }

    public void setLit(Lit lit) {
        this.lit = lit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getNumSecuriteSocial() {
        return numSecuriteSocial;
    }

    public void setNumSecuriteSocial(int numSecuriteSocial) {
        this.numSecuriteSocial = numSecuriteSocial;
    }

    public Date getEdate() {
        return edate;
    }

    public void setEdate(Date edate) {
        this.edate = edate;
    }

    public Date getSdate() {
        return sdate;
    }

    public void setSdate(Date sdate) {
        this.sdate = sdate;
    }
}
