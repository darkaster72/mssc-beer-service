package io.github.darkaster72.mssc_beer_service.service;

import io.github.darkaster72.mssc_beer_service.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getById(UUID id) {
        return CustomerDto.builder().id(id).name("Somaji aluj").build();
    }
}
