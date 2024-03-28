package simplon.co.ecf_hopital.presentation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import simplon.co.ecf_hopital.business.dto.PatientDto;
import simplon.co.ecf_hopital.business.service.IPatientService;

public class ModifierPatientController {
    private IPatientService patientService;
@PutMapping("/patients/{id}")
public void modifierPatient(@PathVariable Integer id , @RequestBody PatientDto patientDto){
    patientService.modifierPatient(patientDto ,id);
}
@Autowired
public void setPatientService(IPatientService patientService) {
        this.patientService = patientService;
    }
}
