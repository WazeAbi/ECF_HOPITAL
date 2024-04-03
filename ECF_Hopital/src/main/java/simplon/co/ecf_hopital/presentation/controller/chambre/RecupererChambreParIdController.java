package simplon.co.ecf_hopital.presentation.controller.chambre;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import simplon.co.ecf_hopital.business.dto.ChambreDto;
import simplon.co.ecf_hopital.business.service.chambre.IChambreService;
@RestController
public class RecupererChambreParIdController {
    private IChambreService chambreService;

    @GetMapping("/chambre/{idchambre}")
    public ChambreDto recupererChamberParId(@PathVariable Integer idchambre) {
        return chambreService.recupererLitParId(idchambre);
    }

    @Autowired
    public void setChambreService(IChambreService chambreService) {
        this.chambreService = chambreService;
    }
}
