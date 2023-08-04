package co.edu.reactive.trabajo1.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("buy")
public class Buy {
    @Id
    private Integer id;
    private Integer idUser;
    private Integer idProduct;
}
