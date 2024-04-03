package simplon.co.ecf_hopital.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import simplon.co.ecf_hopital.persistance.entity.Lit;

public interface ILitRepository extends JpaRepository<Lit, Integer> {
}
