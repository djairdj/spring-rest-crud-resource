# Digytal - Programação, Pesquisa, Educação
www.digytal.com.br
(11) 95894-0362

#### Autores
- [Gleyson Sampaio](https://github.com/glysns)

## Spring Rest CRUD Resource
Criando uma aplicação REST com operações CRUD reutilizáveis

É comum termos que disponibilizar via API operações de CRUD em grande parte dos nossos endpoints, desta forma nós resolvemos implementar uma forma um pouco mais produtiva em nossa aplicação.

Baseado nos padrão `AbstractDao` e `Repository`, criamos o conceito de `CrudController`, um mecanismo genérico que através de conceitos de Polimorfismo e Herança conseguimos de métodos reutilizávies como: `save`, `update`, `delete`, `findOne` e `findAll`.

### Abaixo temos nossa API documentada com Swagger para persistir 2 entidades `marca` e `produto`.


![](/img/swagger.png "Bens criados")

### Como funciona ?
Iniciamos o projeto no site https://start.spring.io/

![](/img/start.png "Bens criados")

Em um arquitetura Spring Boot conseguimos obter o contexto da aplicação e é que entra em ação a nossa customização para conhecer os beans (services e repositorys) criados pelo framework.

```java

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
        System.out.println(String.format("Componente identificado com o nome: %s localizado em: %s", beanName,  bean.toString()));
        return (T) bean;
    }
    private String beanName(Class clazz) {
        String beanName = clazz.getSimpleName();
        beanName = beanName.substring(0,1).toLowerCase() + beanName.substring(1,beanName.length());
        return beanName;
    }
}

```

