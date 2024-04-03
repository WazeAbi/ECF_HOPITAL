package simplon.co.ecf_hopital.business.dto;


import simplon.co.ecf_hopital.persistance.entity.Lit;

import java.util.Date;

public class PatientDto {
    private int id;
    private String nom;
    private String prenom;
    private int numSecuriteSocial;
    private Date edate;
    private Date sdate;
    private LitDto litDto;


    public LitDto getLitDto() {
        return litDto;
    }

    public void setLitDto(LitDto litDto) {
        this.litDto = litDto;
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
