package simplon.co.ecf_hopital.business.convert;

import org.springframework.stereotype.Component;
import simplon.co.ecf_hopital.business.dto.PatientDto;
import simplon.co.ecf_hopital.persistance.entity.Patient;

import java.util.ArrayList;
import java.util.List;

@Component
public class PatientConvert {
    private static PatientConvert instance;

    private PatientConvert() {

    }

    public static PatientConvert getInstance() {
        if (instance == null)
            instance = new PatientConvert();
        return instance;
    }

    public Patient convertDtoToEntity(PatientDto patientDto) {
        Patient patient = new Patient();
        patient.setId(patientDto.getId());
        patient.setNom(patientDto.getNom());
        patient.setPrenom(patientDto.getPrenom());
        patient.setNumSecuriteSocial(patientDto.getNumSecuriteSocial());
        patient.setEdate(patientDto.getEdate());
        patient.setSdate(patientDto.getSdate());
        patient.setLit(patientDto.getLitDto() != null ? LitConvert.getInstance().convertDtoToEntity(patientDto.getLitDto()) : null);
        return patient;
    }

    public PatientDto convertEntityToDto(Patient patient) {
        PatientDto patientDto = new PatientDto();
        patientDto.setId(patient.getId());
        patientDto.setNom(patient.getNom());
        patientDto.setPrenom(patient.getPrenom());
        patientDto.setNumSecuriteSocial(patient.getNumSecuriteSocial());
        patientDto.setEdate(patient.getEdate());
        patientDto.setSdate(patient.getSdate());
        patientDto.setLitDto(patient.getLit() != null ? LitConvert.getInstance().convertEntityToDto(patient.getLit()) : null);
        return patientDto;
    }

    public List<Patient> convertListDtoToPatient(final List<PatientDto> ListPatientDto) {
        final List<Patient> ListPatient = new ArrayList<>();
        for (PatientDto patientDto : ListPatientDto) {
            ListPatient.add(convertDtoToEntity(patientDto));
        }
        return ListPatient;
    }

    public List<PatientDto> convertListEntityToDto(final List<Patient> ListPatient) {
        final List<PatientDto> ListPatientDto = new ArrayList<>();
        for (Patient patient : ListPatient) {
            ListPatientDto.add(convertEntityToDto(patient));
        }
        return ListPatientDto;
    }
}
