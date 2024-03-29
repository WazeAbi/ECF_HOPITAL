package simplon.co.ecf_hopital.persistance.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "chambre")
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idchambre;

    public int getIdchambre() {
        return idchambre;
    }

    public void setIdchambre(int idchambre) {
        this.idchambre = idchambre;
    }
}
