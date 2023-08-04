package co.edu.reactive.trabajo1.repository;

import co.edu.reactive.trabajo1.model.Type;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

public interface TypeRepository extends R2dbcRepository<Type,Integer> {
}
