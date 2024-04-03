package simplon.co.ecf_hopital.business.dto;

public class LitDto {
    private int idLit;
    private boolean occupe;
    private ChambreDto chambreDto;

    public ChambreDto getChambreDto() {
        return chambreDto;
    }

    public void setChambreDto(ChambreDto chambreDto) {
        this.chambreDto = chambreDto;
    }

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
