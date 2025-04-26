package service.command;

import model.User;
import repository.user.UserRepository;

public class UpdateUserHandler {

    private final UserRepository userRepository;

    public UpdateUserHandler() {
        this.userRepository = new UserRepository();
    }

    public void execute(User user) {
        userRepository.updateUser(user);
    }
}
