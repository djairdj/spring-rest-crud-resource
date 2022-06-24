package digytal.spring.rest.crud.resource.repository;

import digytal.spring.rest.crud.resource.model.Marca;
import digytal.spring.rest.crud.resource.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarcaRepository extends JpaRepository<Marca, Integer> {
}
