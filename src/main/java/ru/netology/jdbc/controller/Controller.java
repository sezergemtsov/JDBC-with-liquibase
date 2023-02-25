package ru.netology.jdbc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.jdbc.service.Service;

@RestController
@RequestMapping("/")
public class Controller {

    Service service;

    public Controller(Service service) {
        this.service=service;
    }

    @GetMapping("/products/fetch-product")
    public String get(@RequestParam("name")String name) {
        return service.getProduct(name);
    }
}
