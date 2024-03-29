package simplon.co.ecf_hopital.persistance.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "chambre")
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idchambre;
    @Column(name = "numerodechambre")
    private int numeroDeChambre;

    public int getNumerodeChambre() {
        return numeroDeChambre;
    }
    @ManyToOne @JoinColumn( name="idservice" )
    public Service service;



    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public void setNumerodeChambre(int numeroDeChambre) {
        this.numeroDeChambre = numeroDeChambre;
    }

    public int getIdchambre() {
        return idchambre;
    }

    public void setIdchambre(int idchambre) {
        this.idchambre = idchambre;
    }
}
