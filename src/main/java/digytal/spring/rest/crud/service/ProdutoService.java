package digytal.spring.rest.crud.service;

import digytal.spring.rest.crud.model.Marca;
import digytal.spring.rest.crud.model.Produto;
import digytal.spring.rest.crud.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService extends CrudService <Produto> {

    /*
   Este método é opcional,
   ele executa antes de salvar
   voce poder usar para validar dados da entidade
   antes de tentar salvar
    */
    @Override
    protected void prepareSave(Produto entity) {

    }

}
