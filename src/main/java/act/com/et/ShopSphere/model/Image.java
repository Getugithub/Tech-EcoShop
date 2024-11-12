package act.com.et.ShopSphere.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.boot.model.naming.ImplicitAnyDiscriminatorColumnNameSource;

import java.sql.Blob;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity()
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String fileName;
    private String fileType;
    private Blob image;
    private String downloadUrl;

    @ManyToOne(cascade = CascadeType.ALL)
    private Product product;


}
