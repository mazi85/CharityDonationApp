package pl.mazi85.charity.service.interfaces;

import pl.mazi85.charity.model.User;

public interface UserService {
    User createUser(User user);
    User createAdmin(User user);
}
