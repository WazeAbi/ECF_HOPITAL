package simplon.co.ecf_hopital.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import simplon.co.ecf_hopital.persistance.entity.Service;

public interface IServiceRepository extends JpaRepository<Service,Integer> {
}
