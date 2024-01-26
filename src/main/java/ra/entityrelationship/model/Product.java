package ra.entityrelationship.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String productName;
    private double price;
    private int stock;
    @ManyToOne
    @JoinColumn(name = "catalog_id")
    private Catalog catalog;
}
