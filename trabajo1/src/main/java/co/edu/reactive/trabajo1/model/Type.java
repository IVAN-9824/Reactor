package co.edu.reactive.trabajo1.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Type {
    @Id
    private Integer id;
    private String typeId;
}
