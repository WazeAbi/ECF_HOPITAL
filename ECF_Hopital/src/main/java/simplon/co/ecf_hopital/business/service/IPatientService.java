package simplon.co.ecf_hopital.business.service;

import org.springframework.stereotype.Service;
import simplon.co.ecf_hopital.business.dto.PatientDto;
import simplon.co.ecf_hopital.persistance.entity.Patient;

import java.util.List;
@Service
public interface IPatientService {
    List<PatientDto> listerPatient();
    PatientDto recuperParId(final int id);
    void modifierPatient(PatientDto patient, int id);
    void creerPatient(PatientDto patient);
    void supprimerPatient(int id);


}
