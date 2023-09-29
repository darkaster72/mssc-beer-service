package io.github.darkaster72.mssc_beer_service.web.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import jakarta.validation.constraints.Positive;
import lombok.Builder;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Builder
public record BeerDto(
        @Null
        UUID id,
        @NotBlank
        String beerName,
        @Null
        Integer version,
        @Null
        OffsetDateTime createdDate,
        @Null
        OffsetDateTime lastModifiedDate,
        @NotBlank
        BeerStyle beerStyle,
        @Positive
        @NotNull
        Long upc,
        @Positive
        @NotNull
        BigDecimal price,
        @Positive
        @NotNull
        Integer quantityOnHand

) {
}
