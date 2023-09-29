package io.github.darkaster72.mssc_beer_service.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;

import java.util.UUID;

@Getter
@Entity
@Builder
public class Customer {
    @Id
    private UUID id;
    private String name;
}
