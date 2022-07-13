package pl.mazi85.charity.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.mazi85.charity.model.Token;
import pl.mazi85.charity.model.User;
import pl.mazi85.charity.repository.TokenRepository;
import pl.mazi85.charity.service.interfaces.TokenService;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class DefaultTokenService implements TokenService {

    private final TokenRepository tokenRepository;

    @Override
    public Token createRegisterTokenForUser(User user) {
        UUID uuid = UUID.randomUUID();
        Token token = Token.builder().
                uuid(uuid).
                user(user).
                build();
        return tokenRepository.save(token);
    }
}
