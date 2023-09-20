package io.github.darkaster72.mssc_beer_service.web.service;

import io.github.darkaster72.mssc_beer_service.web.model.BeerDto;
import io.github.darkaster72.mssc_beer_service.web.model.BeerStyle;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID id) {

        return BeerDto.builder().id(id).beerName("Random Shite").beerStyle(BeerStyle.LAGER).build();
    }

    @Override
    public BeerDto save(BeerDto beerDto) {
        return BeerDto.builder().id(UUID.randomUUID()).beerName("Random Shite").beerStyle(BeerStyle.ALE).build();
    }

    @Override
    public BeerDto update(UUID id, BeerDto beerDto) {
        return BeerDto.builder().id(id).beerName("Random Shite").beerStyle(BeerStyle.PORTER).build();
    }

    @Override
    public void delete(UUID id) {
//        TODO: implement
    }

    @Override
    public Page<BeerDto> get(PageRequest request) {
        return Page.empty(request);
    }
}

