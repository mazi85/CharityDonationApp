package pl.mazi85.charity.service.interfaces;

import pl.mazi85.charity.model.User;

import java.util.List;

public interface UserService {
    User createUser(User user);
    User createAdmin(User user);

    List<User> allUsers();

    User findUserById(Long userId);

    User editUser(User user);
}
