package simplon.co.ecf_hopital.business.service.chambre;

import org.springframework.stereotype.Service;
import simplon.co.ecf_hopital.business.dto.ChambreDto;


import java.util.List;
@Service
public interface IChambreService {
    List<ChambreDto> ListerLesLits();
    ChambreDto recupererLitParId(final int idchambre);
}
