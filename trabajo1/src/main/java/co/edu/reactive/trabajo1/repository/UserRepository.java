package co.edu.reactive.trabajo1.repository;

import co.edu.reactive.trabajo1.model.User;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends R2dbcRepository<User, Integer> {


}
