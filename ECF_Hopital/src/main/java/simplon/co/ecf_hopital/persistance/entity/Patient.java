package simplon.co.ecf_hopital.persistance.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="patient")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name= "nom")
    private String nom;
    @Column(name = "prenom")
    private String prenom;
    @Column(name = "numsecuritesocial")
    private String numsecuritesocial;
    @Column(name = "edate")
    private Date edate;
    @Column(name ="sdate")
    private Date sdate;

}
