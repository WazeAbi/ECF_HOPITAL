package simplon.co.ecf_hopital.business.service;

import simplon.co.ecf_hopital.business.dto.PatientDto;

public interface IPatientService {
    PatientDto recuperParNumSecuritSocial(final int numSecuriteSocial);
    void modifierPatient(PatientDto patient);
    void creerPatient(PatientDto patient);
    void supprimerPatient(int id);

}
