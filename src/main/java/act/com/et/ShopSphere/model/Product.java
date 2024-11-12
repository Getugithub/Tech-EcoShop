package act.com.et.ShopSphere.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    private String productName;
    private String description;
    private String brand;
    private BigDecimal price;
    private int inventory;
    private LocalDate createdDate;
    private LocalDate updatedDate;

    @ManyToOne(cascade = CascadeType.ALL)
    private Category category;  // Ensure this is your entity class

    @OneToMany(mappedBy = "Product", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Image> images;
}