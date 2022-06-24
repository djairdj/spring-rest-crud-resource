package digytal.spring.rest.crud.controller;

import digytal.spring.rest.crud.model.Marca;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/marcas")
public class MarcaController extends CrudController <Marca> {
}
