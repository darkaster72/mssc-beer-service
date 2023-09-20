package io.github.darkaster72.mssc_beer_service.service;


import io.github.darkaster72.mssc_beer_service.web.model.BeerDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID id);

    BeerDto save(BeerDto beerDto);

    BeerDto update(UUID id, BeerDto beerDto);

    void delete(UUID id);

    Page<BeerDto> get(PageRequest request);
}
