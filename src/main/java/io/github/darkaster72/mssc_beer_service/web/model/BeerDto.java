package io.github.darkaster72.mssc_beer_service.web.model;

import lombok.Builder;

import java.time.OffsetDateTime;
import java.util.UUID;

@Builder
public record BeerDto(
        UUID id, Integer version, OffsetDateTime createdDate, OffsetDateTime lastModifiedDate,
        String beerName, BeerStyle beerStyle, Long upc) {
}
