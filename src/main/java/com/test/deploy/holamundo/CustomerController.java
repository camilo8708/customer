package com.test.deploy.holamundo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @GetMapping(value = "customers/{key}")
    public Customer getCustomerByKey(@PathVariable(name = "key") String key){
        Customer customer = new Customer("Huertas Segura", "Cristian Camilo", key);
        return customer;
    }
}
