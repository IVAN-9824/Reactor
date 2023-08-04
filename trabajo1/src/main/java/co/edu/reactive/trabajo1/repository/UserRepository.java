package co.edu.reactive.trabajo1.repository;

import co.edu.reactive.trabajo1.model.Users;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface UserRepository extends R2dbcRepository<Users, Integer> {



}
