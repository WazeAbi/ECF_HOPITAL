package simplon.co.ecf_hopital.persistance.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Chambre")
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idchambre;
}
