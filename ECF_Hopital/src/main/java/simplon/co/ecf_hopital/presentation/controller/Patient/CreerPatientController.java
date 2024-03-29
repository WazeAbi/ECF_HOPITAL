package simplon.co.ecf_hopital.presentation.controller.Patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import simplon.co.ecf_hopital.business.dto.PatientDto;
import simplon.co.ecf_hopital.business.service.Patient.IPatientService;

@RestController
public class CreerPatientController {
    private IPatientService patientService;


    @PostMapping("/patients")
    public void creerPatient(@RequestBody PatientDto patient) {
        patientService.creerPatient(patient);
    }

    @Autowired
    public void setPatientService(IPatientService patientService) {
        this.patientService = patientService;
    }
}
