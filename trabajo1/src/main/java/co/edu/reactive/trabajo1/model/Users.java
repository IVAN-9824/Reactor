package co.edu.reactive.trabajo1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("users")
@AllArgsConstructor
public class Users {
    @Id
    private Integer id;
    private Integer typeId;
    private String identification;
    private String name;
}
