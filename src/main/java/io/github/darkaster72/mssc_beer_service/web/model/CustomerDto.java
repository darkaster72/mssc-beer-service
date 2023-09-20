package io.github.darkaster72.mssc_beer_service.web.model;

import lombok.Builder;

import java.util.UUID;

@Builder
public record CustomerDto(UUID id, String name) {
}
