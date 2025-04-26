package service.query;

import model.User;
import repository.user.UserRepository;
import java.util.List;

public class GetAllUsersHandler {

    private final UserRepository userRepository;

    public GetAllUsersHandler() {
        this.userRepository = new UserRepository();
    }

    public List<User> execute() {
        return userRepository.getAllUsers();
    }
}
