package pl.mazi85.charity.service;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import pl.mazi85.charity.model.User;
import pl.mazi85.charity.repository.UserRepository;
import pl.mazi85.charity.service.interfaces.UserService;

@Service
@RequiredArgsConstructor
public class DefaultUserService implements UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;


    @Override
    public User createUser(User user) {

        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRole("CLIENT");
        return userRepository.save(user);
    }
}
