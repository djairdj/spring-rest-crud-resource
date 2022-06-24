package digytal.spring.rest.crud.resource.repository;

import digytal.spring.rest.crud.resource.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.criteria.CriteriaBuilder;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}
