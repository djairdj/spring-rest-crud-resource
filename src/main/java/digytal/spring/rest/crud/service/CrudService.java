package digytal.spring.rest.crud.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public abstract class CrudService<T> {
    protected JpaRepository repository;
    public CrudService(JpaRepository repository){
        this.repository = repository;
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
