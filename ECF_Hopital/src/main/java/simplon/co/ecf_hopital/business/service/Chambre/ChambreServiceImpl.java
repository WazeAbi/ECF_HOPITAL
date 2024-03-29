package simplon.co.ecf_hopital.business.service.Chambre;

import org.springframework.beans.factory.annotation.Autowired;
import simplon.co.ecf_hopital.business.dto.ChambreDto;
import simplon.co.ecf_hopital.persistance.repository.IChambreRepository;

import java.util.List;

public class ChambreServiceImpl implements IChambreService {
    private IChambreRepository repoChambre;
    private ChambreConvert convertChambre;


    @Override
    public List<ChambreDto> ListerLesLits() {
        //TODO
        return null;
    }

    @Override
    public ChambreDto recupererLitParId(int id) {
        //TODO
        return null;
    }

    @Autowired
    public void setRepo(IChambreRepository repo) {
        this.repo = repo;
    }

    @Autowired
    public void setConvertChambre(ChambreConvert convertChambre) {
        this.convertChambre = convertChambre;
    }
}
