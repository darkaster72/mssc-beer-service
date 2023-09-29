package io.github.darkaster72.mssc_beer_service.web.mapper;

import io.github.darkaster72.mssc_beer_service.domain.Customer;
import io.github.darkaster72.mssc_beer_service.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {
    CustomerDto map(Customer entity);

    Customer map(CustomerDto dto);
}

