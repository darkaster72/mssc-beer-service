package io.github.darkaster72.mssc_beer_service.web.service;

import io.github.darkaster72.mssc_beer_service.web.mapper.CustomerMapper;
import io.github.darkaster72.mssc_beer_service.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
class CustomerServiceImpl implements CustomerService {
    private final CustomerMapper customerMapper;

    CustomerServiceImpl(CustomerMapper customerMapper) {
        this.customerMapper = customerMapper;
    }

    @Override
    public CustomerDto getById(UUID id) {
        return CustomerDto.builder().id(id).name("Somaji aluj").build();
    }
}
