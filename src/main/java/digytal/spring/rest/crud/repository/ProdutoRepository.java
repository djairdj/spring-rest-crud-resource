package digytal.spring.rest.crud.repository;

import digytal.spring.rest.crud.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}
