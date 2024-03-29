package simplon.co.ecf_hopital.presentation.controller.chambre;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import simplon.co.ecf_hopital.business.dto.ChambreDto;
import simplon.co.ecf_hopital.business.service.chambre.IChambreService;

import java.util.List;

@RestController
public class RecupererChambreParId {
    private IChambreService chambreService;

    public List<ChambreDto> ListerLesChambres() {
        return chambreService.ListerLesLits();
    }

    @Autowired
    public void setChambreService(IChambreService chambreService) {
        this.chambreService = chambreService;
    }
}
