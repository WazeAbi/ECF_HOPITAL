package simplon.co.ecf_hopital.presentation.controller.patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import simplon.co.ecf_hopital.business.service.patient.IPatientService;

@RestController
public class SupprimerPatientController {

    private
    IPatientService patientService;
   @DeleteMapping("/patients/{id}")
   public void SupprimerPatient(@PathVariable Integer id){
       patientService.supprimerPatient(id);
   }
    @Autowired
    public void setPatientService(IPatientService patientService) {
        this.patientService = patientService;
    }
}
