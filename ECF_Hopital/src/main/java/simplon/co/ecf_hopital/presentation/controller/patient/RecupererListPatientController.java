package simplon.co.ecf_hopital.presentation.controller.patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import simplon.co.ecf_hopital.business.dto.PatientDto;
import simplon.co.ecf_hopital.business.service.patient.IPatientService;

import java.util.List;

@RestController
public class RecupererListPatientController {
    private IPatientService patientService;
@GetMapping("/patients")
public List<PatientDto> listerPatient(){
    return patientService.listerPatient();
}
    @Autowired
    public void setPatientService(IPatientService patientService) {
        this.patientService = patientService;
    }
}
