package io.github.darkaster72.mssc_beer_service.web.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Null;
import jakarta.validation.constraints.Positive;
import lombok.Builder;

import java.util.UUID;

@Builder
public record BeerDto(
        @Null
        UUID id,
        @NotBlank
        String beerName,
        @NotBlank
        BeerStyle beerStyle,
        @Positive
        Long upc) {
}
