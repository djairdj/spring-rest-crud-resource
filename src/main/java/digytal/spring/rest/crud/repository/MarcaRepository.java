package digytal.spring.rest.crud.repository;

import digytal.spring.rest.crud.model.Marca;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarcaRepository extends JpaRepository<Marca, Integer> {
}
