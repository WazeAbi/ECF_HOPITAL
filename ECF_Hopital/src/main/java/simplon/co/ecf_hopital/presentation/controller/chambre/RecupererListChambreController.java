package simplon.co.ecf_hopital.presentation.controller.chambre;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import simplon.co.ecf_hopital.business.dto.ChambreDto;
import simplon.co.ecf_hopital.business.service.chambre.IChambreService;

public class RecupererListChambreController {
    private IChambreService chambreService;

    @GetMapping("/chambre/{id}")
    public ChambreDto recupererChamberParId(@PathVariable Integer id) {
        return chambreService.recupererLitParId(id);
    }

    @Autowired
    public void setChambreService(IChambreService chambreService) {
        this.chambreService = chambreService;
    }
}
