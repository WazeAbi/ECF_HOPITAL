package simplon.co.ecf_hopital.business.service.service;

import org.springframework.stereotype.Service;
import simplon.co.ecf_hopital.business.dto.ServiceDto;

import java.util.List;

@Service
public interface IServiceService {
List<ServiceDto> ListerLesServices();
ServiceDto recupererServiceParId(final int id);
}
