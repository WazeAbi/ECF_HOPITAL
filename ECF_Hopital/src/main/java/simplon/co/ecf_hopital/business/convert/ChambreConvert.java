package simplon.co.ecf_hopital.business.convert;

import jakarta.persistence.Column;
import org.springframework.stereotype.Component;
import simplon.co.ecf_hopital.business.dto.ChambreDto;
import simplon.co.ecf_hopital.persistance.entity.Chambre;

import java.util.ArrayList;
import java.util.List;

@Component
public class ChambreConvert {
    private static ChambreConvert instance;

    private ChambreConvert() {

    }

    public static ChambreConvert getInstance() {
        if (instance == null)
            instance = new ChambreConvert();
        return instance;
    }

    public Chambre convertDtoToEntity(ChambreDto chambreDto) {
        Chambre chambre = new Chambre();
        chambre.setIdchambre(chambreDto.getIdchambre());
        chambre.setNumerodeChambre(chambreDto.getNumeroDeChambre());
        chambre.setService(chambreDto.getServiceDto()!= null ? ServiceConvert.getInstance().convertDtoToEntity(chambreDto.getServiceDto()) : null );
        return chambre;
    }

    public ChambreDto convertEntityToDto(Chambre chambre) {
        ChambreDto chambreDto = new ChambreDto();
        chambreDto.setIdchambre(chambre.getIdchambre());
        chambreDto.setNumeroDeChambre(chambre.getNumerodeChambre());
        chambreDto.setServiceDto(chambre.getService() != null ? ServiceConvert.getInstance().convertEntityToDto(chambre.getService()) : null );
        return chambreDto;
    }

    public List<Chambre> convertListDtoToListEntity(List<ChambreDto> listChambreDto) {
        List<Chambre> listChambre = new ArrayList<>();
        for (ChambreDto chambreDto : listChambreDto) {
            listChambre.add(convertDtoToEntity(chambreDto));
        }
        return listChambre;
    }

    public List<ChambreDto> convertListEntityToListDto(List<Chambre> listChambre) {
        List<ChambreDto> listChambreDto = new ArrayList<>();
        for (Chambre chambre : listChambre) {
            listChambreDto.add(convertEntityToDto(chambre));

        }
        return listChambreDto;
    }

}
