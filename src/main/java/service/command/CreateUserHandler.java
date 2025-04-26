package service.command;

import model.User;
import repository.user.UserRepository;

public class CreateUserHandler {

    private final UserRepository userRepository;

    public CreateUserHandler() {
        this.userRepository = new UserRepository();
    }

    public void execute(User user) {
        userRepository.saveUser(user);
    }
}
