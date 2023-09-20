package io.github.darkaster72.mssc_beer_service.service;

import io.github.darkaster72.mssc_beer_service.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getById(UUID id);
}
