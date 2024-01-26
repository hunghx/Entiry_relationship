package ra.entityrelationship.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Catalog {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String catalogName;
//    @OneToMany(mappedBy ="catalog")
//    private List<Product> productList;
}
