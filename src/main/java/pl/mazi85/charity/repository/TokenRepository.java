package pl.mazi85.charity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.mazi85.charity.model.Token;

import java.util.UUID;

public interface TokenRepository extends JpaRepository<Token,Long > {
    Token findTokenByUuidOrderByCreatedOnDesc(String uuid);
}
