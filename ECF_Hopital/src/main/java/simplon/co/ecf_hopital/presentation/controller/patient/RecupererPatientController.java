package simplon.co.ecf_hopital.presentation.controller.patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import simplon.co.ecf_hopital.business.dto.PatientDto;
import simplon.co.ecf_hopital.business.service.patient.IPatientService;

@RestController
public class RecupererPatientController {
private IPatientService patientService;
@GetMapping("/patients/{id}")
public PatientDto recupererParId(@PathVariable Integer id){return patientService.recuperParId(id);}
    @Autowired
    public void setPatientService(IPatientService patientService) {
        this.patientService = patientService;
    }
}
