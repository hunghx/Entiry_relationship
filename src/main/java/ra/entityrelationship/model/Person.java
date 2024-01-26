package ra.entityrelationship.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;
    private  String name;
    private Boolean sex;
    @OneToOne
    @JoinColumn(name = "identity_id")
    private Identity identity;
}
