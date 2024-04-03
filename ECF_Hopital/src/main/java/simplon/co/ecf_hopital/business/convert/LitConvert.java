package simplon.co.ecf_hopital.business.convert;

import org.springframework.stereotype.Component;
import simplon.co.ecf_hopital.business.dto.LitDto;
import simplon.co.ecf_hopital.persistance.entity.Lit;

import java.util.ArrayList;
import java.util.List;
@Component
public class LitConvert {
    private static LitConvert instance;

    private LitConvert() {
    }

    public static LitConvert getInstance() {
        if (instance == null)
            instance = new LitConvert();
        return instance;
    }

    public Lit convertDtoToEntity(LitDto litDto) {
        Lit lit = new Lit();
        lit.setIdLit(litDto.getIdLit());
        lit.setOccupe(litDto.isOccupe());
        lit.setChambre(litDto.getChambreDto() != null ? ChambreConvert.getInstance().convertDtoToEntity(litDto.getChambreDto()) : null );
        return lit;
    }

    public LitDto convertEntityToDto(Lit lit) {
        LitDto litDto = new LitDto();
        litDto.setIdLit(litDto.getIdLit());
        litDto.setOccupe(lit.isOccupe());
        litDto.setChambreDto(lit.getChambre() != null ? ChambreConvert.getInstance().convertEntityToDto(lit.getChambre()) : null );
        return litDto;
    }

    public List<Lit> convertListDtoToEntity(final List<LitDto> ListLitDto) {
        final List<Lit> ListLit = new ArrayList<>();
        for (LitDto litDto : ListLitDto) {
            ListLit.add(convertDtoToEntity(litDto));
        }
        return ListLit;
    }

    public List<LitDto> convertListEntityToListDto(final List<Lit> ListLit) {
        final List<LitDto> ListLitDto = new ArrayList<>();
        for (Lit lit : ListLit) {
            ListLitDto.add(convertEntityToDto(lit));

        }
        return ListLitDto;


    }


}
