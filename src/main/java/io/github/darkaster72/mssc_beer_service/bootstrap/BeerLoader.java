package io.github.darkaster72.mssc_beer_service.bootstrap;

import io.github.darkaster72.mssc_beer_service.dao.BeerRepository;
import io.github.darkaster72.mssc_beer_service.domain.Beer;
import io.github.darkaster72.mssc_beer_service.web.model.BeerStyle;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class BeerLoader implements CommandLineRunner {
    private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadBeerObjects();
    }

    private void loadBeerObjects() {
        if (beerRepository.count() == 0) {
            var entity = Beer.builder()
                    .beerName("Yager")
                    .beerStyle(BeerStyle.LAGER)
                    .quantityToBrew(29)
                    .upc(2131231232L)
                    .price(BigDecimal.valueOf(10.96))
                    .build();
            var entity2 = Beer.builder()
                    .beerName("Hienekin")
                    .beerStyle(BeerStyle.PORTER)
                    .quantityToBrew(20)
                    .upc(213123672L)
                    .price(BigDecimal.valueOf(12.60))
                    .build();
            beerRepository.save(entity);
            beerRepository.save(entity2);
            System.out.println("Saved Beer Count: " + beerRepository.count());
        }
    }
}
