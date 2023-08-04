package co.edu.reactive.trabajo1.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("type_id")
public class Type {
    @Id
    private Integer id;
    private String typeId;
}
