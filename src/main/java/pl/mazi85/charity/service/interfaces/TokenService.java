package pl.mazi85.charity.service.interfaces;

import pl.mazi85.charity.model.Token;
import pl.mazi85.charity.model.User;

import java.util.UUID;

public interface TokenService {
    Token createRegisterTokenForUser(User user);
}
