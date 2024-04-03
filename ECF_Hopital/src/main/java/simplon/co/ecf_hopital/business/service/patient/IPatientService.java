package simplon.co.ecf_hopital.business.service.patient;

import org.springframework.stereotype.Service;
import simplon.co.ecf_hopital.business.dto.PatientDto;

import java.util.List;
@Service
public interface IPatientService {
    List<PatientDto> listerPatient();
    PatientDto recuperParId(final int id);
    void modifierPatient(PatientDto patient, int id);
    void creerPatient(PatientDto patient);
    void supprimerPatient(int id);


}
