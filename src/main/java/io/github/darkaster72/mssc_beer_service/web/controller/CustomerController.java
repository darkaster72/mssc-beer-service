package io.github.darkaster72.mssc_beer_service.web.controller;

import io.github.darkaster72.mssc_beer_service.web.service.CustomerService;
import io.github.darkaster72.mssc_beer_service.web.model.CustomerDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/{id}")
    ResponseEntity<CustomerDto> get(@PathVariable UUID id) {
        return ResponseEntity.ok(customerService.getById(id));
    }
}
