package co.edu.reactive.trabajo1.repository;


import co.edu.reactive.trabajo1.model.Buy;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

public interface BuyRepository extends R2dbcRepository<Buy,Integer> {

}
