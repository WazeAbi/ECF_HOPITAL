package simplon.co.ecf_hopital.business.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import simplon.co.ecf_hopital.business.convert.ServiceConvert;
import simplon.co.ecf_hopital.business.dto.ServiceDto;
import simplon.co.ecf_hopital.persistance.entity.Service;
import simplon.co.ecf_hopital.persistance.repository.IServiceRepository;

import java.util.List;

@org.springframework.stereotype.Service
public class ServiceServiceImpl implements IServiceService {
    private IServiceRepository serviceRepository;
    private ServiceConvert serviceConvert;

    @Override
    public List<ServiceDto> ListerLesServices() {
        final List<Service> result = serviceRepository.findAll();
        return ServiceConvert.getInstance().convertListEntityToListDto(result);
    }


    @Override
    public ServiceDto recupererServiceParId(int id) {
        return serviceConvert.convertEntityToDto(serviceRepository.getReferenceById(id));

    }

    @Autowired
    public IServiceRepository getServiceRepository() {
        return serviceRepository;
    }

    @Autowired
    public void setServiceRepository(IServiceRepository serviceRepository) {
        this.serviceRepository = serviceRepository;
    }

    public ServiceConvert getServiceConvert() {
        return serviceConvert;
    }

    public void setServiceConvert(ServiceConvert serviceConvert) {
        this.serviceConvert = serviceConvert;
    }
}
