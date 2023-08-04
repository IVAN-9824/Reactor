package co.edu.reactive.trabajo1.repository;

import co.edu.reactive.trabajo1.model.Product;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

public interface ProductRepository extends R2dbcRepository<Product, Integer> {
}
