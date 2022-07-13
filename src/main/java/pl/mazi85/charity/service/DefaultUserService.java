package pl.mazi85.charity.service;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import pl.mazi85.charity.model.User;
import pl.mazi85.charity.repository.UserRepository;
import pl.mazi85.charity.service.interfaces.UserService;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DefaultUserService implements UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;


    @Override
    public User createUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRole("USER");
        return userRepository.save(user);
    }

    @Override
    public User createAdmin(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRole("ADMIN");
        return userRepository.save(user);
    }

    @Override
    public List<User> allUsers() {

        return userRepository.findAllUsersByRole("USER");
    }
    @Override
    public List<User> allAdmins() {
        return userRepository.findAllUsersByRole("ADMIN");
    }

    @Override
    public User editAdmin(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    @Override
    public User findAdminById(Long adminId) {
        return findUserById(adminId);
    }

    @Override
    public User getUserByUsername(String username) {
        return userRepository.findByUsername(username).orElseThrow();
    }

    @Override
    public void editUserPassword(User user) {
        User userForEdit = findUserById(user.getId());
        userForEdit.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(userForEdit);
    }

    @Override
    public User findUserById(Long userId) {
        return userRepository.getById(userId);
    }

    @Override
    @Transactional
    public User editUser(User user) {
        User userForEdit = findUserById(user.getId());
        userForEdit.setName(user.getName());
        userForEdit.setUsername(user.getUsername());
        userForEdit.setLastName(user.getLastName());
        return userRepository.save(userForEdit);
    }

    @Override
    public void deleteUser(Long userId) {
    userRepository.deleteById(userId);
    }

    @Override
    public void blockUser(Long userId) {
        User user = findUserById(userId);
        user.setEnabled(false);
        userRepository.save(user);
    }

    @Override
    public void unblockUser(Long userId) {
        User user = findUserById(userId);
        user.setEnabled(true);
        userRepository.save(user);
    }


}
