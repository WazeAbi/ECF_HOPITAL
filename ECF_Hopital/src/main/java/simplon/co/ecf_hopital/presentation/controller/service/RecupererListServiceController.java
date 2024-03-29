package simplon.co.ecf_hopital.presentation.controller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import simplon.co.ecf_hopital.business.dto.ServiceDto;
import simplon.co.ecf_hopital.business.service.service.IServiceService;

import java.util.List;

@RestController
public class RecupererListServiceController {
    private IServiceService serviceService;


    @GetMapping("/service")
    public List<ServiceDto> listerService() {
        return serviceService.ListerLesServices();
    }

    @Autowired
    public void setServiceService(IServiceService serviceService) {
        this.serviceService = serviceService;
    }
}
