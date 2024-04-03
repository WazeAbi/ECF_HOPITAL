package simplon.co.ecf_hopital.persistance.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "service")
public class Service {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idservice;
    @Column(name = "nomdeservice")
    private String nomdeservice;

    public int getIdservice() {
        return idservice;
    }

    public void setIdservice(int idservice) {
        this.idservice = idservice;
    }

    public String getNomdeservice() {
        return nomdeservice;
    }

    public void setNomdeservice(String nomdeservice) {
        this.nomdeservice = nomdeservice;
    }
}
