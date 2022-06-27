package pl.mazi85.charity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.mazi85.charity.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);

}
