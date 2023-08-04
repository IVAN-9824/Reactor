package co.edu.reactive.trabajo1.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class User {
    @Id
    private Integer id;
    private Integer typeId;
    private String identification;
    private String name;
}
