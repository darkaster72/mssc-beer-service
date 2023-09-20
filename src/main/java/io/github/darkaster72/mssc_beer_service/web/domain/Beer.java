package io.github.darkaster72.mssc_beer_service.web.domain;

import io.github.darkaster72.mssc_beer_service.web.model.BeerStyle;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.annotations.UuidGenerator;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@Builder
@Entity
public class Beer {
    @Id
    @UuidGenerator()
    @Column(updatable = false, nullable = false)
    private UUID id;

    @Version
    private Long version;

    @CreationTimestamp
    @Column(updatable = false)
    private Timestamp createdDate;

    @UpdateTimestamp
    @Column(updatable = false)
    private Timestamp lastModifiedDate;
    private String beerName;
    private BeerStyle beerStyle;

    @Column(unique = true)
    private Long upc;
    private BigDecimal price;
    private Integer minOnHand;
    private Integer quantityToBrew;
}
