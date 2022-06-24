package digytal.spring.rest.crud.service;

import digytal.spring.rest.crud.model.Marca;
import digytal.spring.rest.crud.repository.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class MarcaService extends CrudService <Marca> {
    private MarcaRepository repository;
}
