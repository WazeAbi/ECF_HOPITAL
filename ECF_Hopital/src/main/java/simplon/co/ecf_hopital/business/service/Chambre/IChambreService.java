package simplon.co.ecf_hopital.business.service.Chambre;

import org.springframework.stereotype.Service;
import simplon.co.ecf_hopital.business.dto.ChambreDto;


import java.util.List;
@Service
public interface IChambreService {
    List<ChambreDto> ListerLesLits();
    ChambreDto recupererLitParId(final int id);
}
