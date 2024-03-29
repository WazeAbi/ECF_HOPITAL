package simplon.co.ecf_hopital.business.convert;

import simplon.co.ecf_hopital.business.dto.ServiceDto;
import simplon.co.ecf_hopital.persistance.entity.Service;

import java.util.ArrayList;
import java.util.List;

public class ServiceConvert {
    private static ServiceConvert instance;

    private ServiceConvert() {
    }

    ;

    public static ServiceConvert getInstance() {
        if (instance == null)
            instance = new ServiceConvert();
        return instance;
    }

    public Service convertDtoToEntity(ServiceDto serviceDto) {
        Service service = new Service();
        service.setIdservice(serviceDto.getIdservice());
        service.setNomdeservice(serviceDto.getNomdeservice());
        return service;
    }

    public ServiceDto convertEntityToDto(Service service) {
        ServiceDto serviceDto = new ServiceDto();
        serviceDto.setIdservice(service.getIdservice());
        serviceDto.setNomdeservice(service.getNomdeservice());
        return serviceDto;
    }

    public List<Service> convertListDtoToListEntity(List<ServiceDto> listServiceDto) {
        List<Service> listService = new ArrayList<>();
        for (ServiceDto serviceDto : listServiceDto) {
            listService.add(convertDtoToEntity(serviceDto));
        }
        return listService;
    }
    public List<ServiceDto> convertListEntityToListDto(List<Service> listService){
        List<ServiceDto> listServiceDto = new ArrayList<>();
        for (Service service : listService) {
            listServiceDto.add(convertEntityToDto(service));

        }
        return listServiceDto;
    }
}
