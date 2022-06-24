package digytal.spring.rest.crud.service;

import digytal.spring.rest.crud.config.Beans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public abstract class CrudService<T> {
    @Autowired
    private Beans beans;
    private JpaRepository repository;
    @PostConstruct
    public void autowired() {
        repository = beans.repository(this);
    }
    public void save(T entity){
        repository.save(entity);
    }
    public <T>T finById(Object id){
        return (T) repository.findById(id);
    }
    public <T> List<T> finByAll(){
        return repository.findAll();
    }
}
