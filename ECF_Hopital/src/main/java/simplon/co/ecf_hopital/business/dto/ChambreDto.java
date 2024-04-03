package simplon.co.ecf_hopital.business.dto;

import simplon.co.ecf_hopital.persistance.entity.Service;

public class ChambreDto {
    private int idchambre;
    private int numeroDeChambre;
    private ServiceDto serviceDto;

    public ServiceDto getServiceDto() {
        return serviceDto;
    }

    public void setServiceDto(ServiceDto serviceDto) {
        this.serviceDto = serviceDto;
    }

    public int getNumeroDeChambre() {
        return numeroDeChambre;
    }

    public void setNumeroDeChambre(int numeroDeChambre) {
        this.numeroDeChambre = numeroDeChambre;
    }

    public int getIdchambre() {
        return idchambre;
    }

    public void setIdchambre(int idchambre) {
        this.idchambre = idchambre;
    }
}
