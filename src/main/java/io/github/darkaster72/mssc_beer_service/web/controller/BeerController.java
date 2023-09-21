package io.github.darkaster72.mssc_beer_service.web.controller;

import io.github.darkaster72.mssc_beer_service.web.model.BeerDto;
import io.github.darkaster72.mssc_beer_service.web.service.BeerService;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/beers")
public class BeerController {
    private final BeerService beerService;

    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping
    ResponseEntity<Page<BeerDto>> get(
            @RequestParam(name = "page", defaultValue = "0") int page,
            @RequestParam(name = "size", defaultValue = "20") int size
    ) {
        return ResponseEntity.ok(beerService.get(PageRequest.of(page, size)));
    }

    @GetMapping("/{id}")
    ResponseEntity<BeerDto> get(@PathVariable UUID id) {
        return ResponseEntity.ok(beerService.getBeerById(id));
    }


    @PostMapping
    ResponseEntity<BeerDto> create(@Valid @RequestBody BeerDto beerDto) {
        var result = beerService.save(beerDto);
        return ResponseEntity.created(URI.create("/api/v1/beers/" + result.id())).body(result);
    }

    @PutMapping("/{id}")
    ResponseEntity<BeerDto> update(@PathVariable UUID id, @Valid @RequestBody BeerDto beerDto) {
        var result = beerService.update(id, beerDto);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    ResponseEntity<Void> delete(@PathVariable UUID id) {
        beerService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
