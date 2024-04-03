package simplon.co.ecf_hopital;

import org.junit.Test;
import simplon.co.ecf_hopital.business.convert.ServiceConvert;
import simplon.co.ecf_hopital.business.dto.ServiceDto;
import simplon.co.ecf_hopital.persistance.entity.Service;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ServiceConvertTest {
    private static ServiceConvert serviceConvert = ServiceConvert.getInstance();

    @Test
    public void testConvertDtoToEntity() {
        ServiceDto serviceDto = new ServiceDto();
        serviceDto.setIdservice(1);
        serviceDto.setNomdeservice("Service Test");
        Service service = serviceConvert.convertDtoToEntity(serviceDto);
        assertEquals(Service.class, service.getClass());
        assertEquals("Service Test", service.getNomdeservice());
    }

    @Test
    public void testConvertEntityToDto() {
        Service service = new Service();
        service.setIdservice(1);
        service.setNomdeservice("Test");
        ServiceDto serviceDto = serviceConvert.convertEntityToDto(service);
        assertEquals(ServiceDto.class, serviceDto.getClass());
        assertEquals("Test", serviceDto.getNomdeservice());
    }
}





