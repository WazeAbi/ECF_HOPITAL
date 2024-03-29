package simplon.co.ecf_hopital.business.service.service;

import simplon.co.ecf_hopital.business.dto.ServiceDto;
import simplon.co.ecf_hopital.persistance.repository.IServiceRepository;

import java.util.List;

public class ServiceServiceImpl implements IServiceService {
    private IServiceRepository serviceRepository;
    private ServiceConvert serviceConvert;
    @Override
    public List<ServiceDto> ListerLesServices() {
        //TODO
        return null;
    }

    @Override
    public ServiceDto recupererServiceParId(int id) {
        //TODO
        return null;
    }
}
