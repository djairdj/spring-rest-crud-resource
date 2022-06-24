package digytal.spring.rest.crud.controller;

import digytal.spring.rest.crud.config.Beans;
import digytal.spring.rest.crud.service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

public class CrudController <T> {
    @Autowired
    private Beans beans;
    protected CrudService service;

    private Class<T> model;
    @PostConstruct
    public void autowired() {
        service = beans.service(model);
    }
}
