package simplon.co.ecf_hopital.persistance.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Lit")
public class Lit {
    private int idLit;
    private boolean occupe;

    public int getIdLit() {
        return idLit;
    }

    public void setIdLit(int idLit) {
        this.idLit = idLit;
    }

    public boolean isOccupe() {
        return occupe;
    }

    public void setOccupe(boolean occupe) {
        this.occupe = occupe;
    }
}
