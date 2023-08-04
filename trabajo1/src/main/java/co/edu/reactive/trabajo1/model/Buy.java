package co.edu.reactive.trabajo1.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Buy {
    @Id
    private Integer id;
    private Integer idUser;
    private Integer idProduct;
}
