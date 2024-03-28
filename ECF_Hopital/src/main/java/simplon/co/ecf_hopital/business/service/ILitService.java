package simplon.co.ecf_hopital.business.service;

import simplon.co.ecf_hopital.business.dto.LitDto;

import java.util.List;

public interface ILitService {
    List<LitDto> ListerLesLits();
    LitDto recupererLitParId(final int id);
}
