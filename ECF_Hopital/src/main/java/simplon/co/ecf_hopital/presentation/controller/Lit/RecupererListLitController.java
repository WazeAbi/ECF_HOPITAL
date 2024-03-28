package simplon.co.ecf_hopital.presentation.controller;

import org.springframework.web.bind.annotation.RestController;
import simplon.co.ecf_hopital.business.dto.LitDto;
import simplon.co.ecf_hopital.business.service.ILitService;

import java.util.List;

@RestController
public class RecupererListLitController {
    private ILitService litService;
    public List<LitDto> ListerLesLits(){
        return litService.ListerLesLits();
    }
    public void setLitService(ILitService litService) {
        this.litService = litService;
    }
}
