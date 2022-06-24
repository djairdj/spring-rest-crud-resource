package digytal.spring.rest.crud.service;

import digytal.spring.rest.crud.model.Marca;
import digytal.spring.rest.crud.repository.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class MarcaService extends CrudService <Marca> {
    /*
    Este método é opcional,
    ele executa antes de salvar
    voce poder usar para validar dados da entidade
    antes de tentar salvar
     */
    @Override
    protected void prepareSave(Marca entity) {
        System.out.println("Regra de verificação da entidade Marca antes de salvar");
    }
}
