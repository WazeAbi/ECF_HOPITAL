package simplon.co.ecf_hopital.presentation.controller.lit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import simplon.co.ecf_hopital.business.dto.LitDto;
import simplon.co.ecf_hopital.business.service.lit.ILitService;
@RestController
public class RecupererLitParIdController {
    private ILitService litService;

    @GetMapping("/lit/{idLit}")
    public LitDto recupererLitParId(@PathVariable Integer idLit){
        return litService.recupererLitParId(idLit);
    }

    @Autowired
    public void setLitService(ILitService litService) {
        this.litService = litService;
    }
}
