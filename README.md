# Digytal - Programação, Pesquisa, Educação
www.digytal.com.br
(11) 95894-0362

#### Autores
- [Gleyson Sampaio](https://github.com/glysns)

## Spring Rest CRUD Resource
Criando uma aplicação REST com operações CRUD reutilizáveis

É comum termos que disponibilizar via API operações de CRUD em grande parte dos nossos endpoints, desta forma nós resolvemos implementar uma forma um pouco mais produtiva em nossa aplicação.

Baseado nos padrão `AbstractDao` e `Repository`, criamos o conceito de `CrudController`, um mecanismo genérico que através de conceitos de Polimorfismo e Herança conseguimos de métodos reutilizávies como: `save`, `update`, `delete`, `findOne` e `findAll`.

Abaixo temos nossa API documentada com Swagger para persistir 2 entidades `marca` e `produto`.


![](/img/swagger.png "Bens criados")
