package simplon.co.ecf_hopital.business.service.patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import simplon.co.ecf_hopital.business.convert.PatientConvert;
import simplon.co.ecf_hopital.business.dto.PatientDto;
import simplon.co.ecf_hopital.persistance.repository.IPatientRepository;
import simplon.co.ecf_hopital.persistance.entity.Patient;

import java.util.List;

@Service
public class PatientServiceImpl implements IPatientService {
    private IPatientRepository repo;



    private PatientConvert convert;
    @Override
    public List<PatientDto> listerPatient() {
        final List<Patient> result = repo.findAll();
        return PatientConvert.getInstance().convertListEntityToDto(result);
    }
    @Override
    public PatientDto recuperParId(int id) {
        return convert.convertEntityToDto(repo.getReferenceById(id));
    }

    @Override
    public void modifierPatient(PatientDto patient,int id) {
    Patient patientToUpdate = convert.convertDtoToEntity(patient);
    Patient patientExistant = repo.findById(id).orElse(null);
    if(patientExistant != null){
        patientExistant.setNom(patientToUpdate.getNom());
        patientExistant.setPrenom(patientExistant.getPrenom());
        patientExistant.setNumSecuriteSocial(patientExistant.getNumSecuriteSocial());
        patientExistant.setEdate(patientExistant.getEdate());
        patientExistant.setSdate(patientExistant.getSdate());
        repo.save(patientExistant);
    }

    }

    @Override
    public void creerPatient(PatientDto patient) {
        repo.save(convert.convertDtoToEntity(patient));
    }

    @Override
    public void supprimerPatient(int id) {
        repo.deleteById(id);
    }

    @Autowired
    public void setRepo(IPatientRepository repo) {
        this.repo = repo;
    }
    @Autowired
    public void setConvert(PatientConvert convert) {
        this.convert = convert;
    }
}
