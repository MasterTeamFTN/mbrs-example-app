package mbrs.exampleapp.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "product")
public class Product {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "barcode")
    private int barcode;

    @Column(name = "type")
    private String type;

    @Column(name = "count")
    private int count;

    @ManyToMany(fetch = FetchType.EAGER)
    private Set<User> users;

    public Product(int barcode, String type, int count) {
        barcode = barcode;
        type = type;
        count = count;
    }
}
