package io.github.darkaster72.mssc_beer_service.dao;

import io.github.darkaster72.mssc_beer_service.domain.Beer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BeerRepository extends JpaRepository<Beer, UUID> {
}
