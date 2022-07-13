package pl.mazi85.charity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.mazi85.charity.model.Token;

public interface TokenRepository extends JpaRepository<Token,Long > {
}
