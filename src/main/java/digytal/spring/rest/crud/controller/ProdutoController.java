package digytal.spring.rest.crud.controller;

import digytal.spring.rest.crud.model.Produto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtos")
public class ProdutoController extends CrudController<Produto> {
}
