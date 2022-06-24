package digytal.spring.rest.crud.controller;

import digytal.spring.rest.crud.config.Beans;
import digytal.spring.rest.crud.service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.lang.reflect.ParameterizedType;
import java.util.List;

@RestController
public abstract class CrudController <T> {
    @Autowired
    private Beans beans;
    protected CrudService<T> service;

    public CrudController() {
        this.model =  (Class<T>) ((ParameterizedType) getClass()
                .getGenericSuperclass()).getActualTypeArguments()[0];
    }

    private Class<T> model;
    /*
      Apos os objetos serem criados
      chamamos o métod automaticamente
      para definir qual service será utilizado
     */
    @PostConstruct
    public void autowired() {
        service = beans.service(model);
    }
    @PostMapping()
    public void save(@RequestBody T entity){
        service.save(entity);
    }
    @PutMapping()
    public void update(@RequestBody T entity){
        service.save(entity);
    }
    @GetMapping("/{id}")
    public <T>T findById(@PathVariable("id") Object id){
        return service.finById(id);
    }
    @GetMapping()
    public <T> List<T> findAll(){
        return service.finByAll();
    }
    @DeleteMapping("/{id}")
    public <T>T deleteById(@PathVariable("id") Object id){
        return service.finById(id);
    }
}
