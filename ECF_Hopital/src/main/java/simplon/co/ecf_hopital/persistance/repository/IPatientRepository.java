package simplon.co.ecf_hopital.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import simplon.co.ecf_hopital.persistance.entity.Patient;

public interface IPatientRepository extends JpaRepository<Patient, Integer > {
    @Query(PatientQuery.REQUETE_RECUPERER_PAR_NOM)
    Patient recupererPatientParNom(final String nom);

}
