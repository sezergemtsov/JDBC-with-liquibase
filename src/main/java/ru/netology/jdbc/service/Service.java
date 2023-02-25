package ru.netology.jdbc.service;

import ru.netology.jdbc.repository.Repository;

@org.springframework.stereotype.Service
public class Service {

    Repository repository;

    public Service(Repository repository) {
        this.repository = repository;
    }

    public String getProduct(String name) {
        return repository.getProductName(name);
    }

}
