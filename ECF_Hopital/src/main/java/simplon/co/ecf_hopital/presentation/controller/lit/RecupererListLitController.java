package simplon.co.ecf_hopital.presentation.controller.lit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import simplon.co.ecf_hopital.business.dto.LitDto;
import simplon.co.ecf_hopital.business.service.lit.ILitService;

import java.util.List;

@RestController
public class RecupererListLitController {
    private ILitService litService;

    @GetMapping("/lit")
    public List<LitDto> ListerLesLits() {
        return litService.ListerLesLits();
    }

    @Autowired
    public void setLitService(ILitService litService) {
        this.litService = litService;
    }
}
