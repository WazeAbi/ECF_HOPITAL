package simplon.co.ecf_hopital.business.service.lit;

import org.springframework.stereotype.Service;
import simplon.co.ecf_hopital.business.dto.LitDto;

import java.util.List;
@Service
public interface ILitService {
    List<LitDto> ListerLesLits();
    LitDto recupererLitParId(final int idLit);
}
