package co.edu.reactive.trabajo1.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("product")
public class Product {

    @Id
    private Integer id;
    private Integer value;
    private String product;
}
