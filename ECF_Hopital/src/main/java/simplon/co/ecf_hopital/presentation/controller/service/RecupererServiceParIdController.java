package simplon.co.ecf_hopital.presentation.controller.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import simplon.co.ecf_hopital.business.dto.ServiceDto;
import simplon.co.ecf_hopital.business.service.service.IServiceService;

@RestController
public class RecupererServiceParIdController {
    private IServiceService serviceService;
    @GetMapping("/service/{idservice}")
    public ServiceDto recuperServiceParId(@PathVariable Integer idservice){
        return serviceService.recupererServiceParId(idservice);
    }

}
