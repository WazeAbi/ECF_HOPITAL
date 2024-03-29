package simplon.co.ecf_hopital.business.service.Lit;

import org.springframework.beans.factory.annotation.Autowired;
import simplon.co.ecf_hopital.business.convert.LitConvert;

import simplon.co.ecf_hopital.business.dto.LitDto;
import simplon.co.ecf_hopital.persistance.entity.Lit;
import simplon.co.ecf_hopital.persistance.repository.ILitRepository;

import java.util.List;

public class LitServiceImpl implements ILitService {
    private ILitRepository repoLit;
    private LitConvert convertLit;


    @Override
    public List<LitDto> ListerLesLits() {
        final List<Lit> result = repoLit.findAll();
        return LitConvert.getInstance().convertListEntityToListDto(result);
    }

    @Override
    public LitDto recupererLitParId(int id) {
        return convertLit.convertEntityToDto(repoLit.getReferenceById(id));
    }

    @Autowired
    public void setRepoLit(ILitRepository repoLit) {
        this.repoLit = repoLit;
    }

    @Autowired
    public void setConvertLit(LitConvert convertLit) {
        this.convertLit = convertLit;
    }
}
