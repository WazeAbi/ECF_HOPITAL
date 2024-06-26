package simplon.co.ecf_hopital.business.service.chambre;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import simplon.co.ecf_hopital.business.convert.ChambreConvert;
import simplon.co.ecf_hopital.business.dto.ChambreDto;
import simplon.co.ecf_hopital.persistance.entity.Chambre;
import simplon.co.ecf_hopital.persistance.repository.IChambreRepository;

import java.util.List;
@Service
public class ChambreServiceImpl implements IChambreService {
    private IChambreRepository repoChambre;
    private ChambreConvert convertChambre;


    @Override
    public List<ChambreDto> ListerLesLits() {
        final List<Chambre> result = repoChambre.findAll();
        return ChambreConvert.getInstance().convertListEntityToListDto(result);

    }

    @Override
    public ChambreDto recupererLitParId(int idchambre) {
        return convertChambre.convertEntityToDto(repoChambre.getReferenceById(idchambre));
    }
    @Autowired
    public void setRepoChambre(IChambreRepository repoChambre) {
        this.repoChambre = repoChambre;
    }

    @Autowired
    public void setConvertChambre(ChambreConvert convertChambre) {
        this.convertChambre = convertChambre;
    }
}
