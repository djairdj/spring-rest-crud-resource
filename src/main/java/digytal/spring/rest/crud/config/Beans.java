package digytal.spring.rest.crud.config;

import digytal.spring.rest.crud.service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;

@Configuration
public class Beans {
    @Autowired
    private ApplicationContext context;
    public <T extends CrudService> T service(Class clazz) {
        String beanName = beanName(clazz) + "Service";
        return componentType(beanName);
    }
    public <T extends JpaRepository> T repository(CrudService service) {
        String beanName = beanName(service.getClass()).replace("Service","Repository");
        return componentType(beanName);
    }
    private <T> T componentType(String beanName) {
        Object bean = context.getBean(beanName);
        System.out.println("Componente localizado " + bean.toString());
        return (T) bean;
    }
    private String beanName(Class clazz) {
        String beanName = clazz.getSimpleName();
        beanName = beanName.substring(0,1).toLowerCase() + beanName.substring(1,beanName.length());
        return beanName;
    }
}
