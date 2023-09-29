package io.github.darkaster72.mssc_beer_service.web.mapper;

import io.github.darkaster72.mssc_beer_service.domain.Beer;
import io.github.darkaster72.mssc_beer_service.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {
    BeerDto map(Beer beer);

    Beer map(BeerDto dto);
}
