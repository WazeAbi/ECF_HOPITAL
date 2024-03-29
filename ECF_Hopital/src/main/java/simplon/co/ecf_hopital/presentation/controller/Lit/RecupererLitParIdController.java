package simplon.co.ecf_hopital.presentation.controller.Lit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import simplon.co.ecf_hopital.business.dto.LitDto;
import simplon.co.ecf_hopital.business.service.Lit.ILitService;

public class RecupererLitParIdController {
    private ILitService litService;

    @GetMapping("/lit/{id}")
    public LitDto recupererLitParId(@PathVariable Integer id){
        return litService.recupererLitParId(id);
    }

    public void setLitService(ILitService litService) {
        this.litService = litService;
    }
}
