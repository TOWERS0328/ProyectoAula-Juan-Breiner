package service.command;

import repository.user.UserRepository;

public class DeleteUserHandler {

    private final UserRepository userRepository;

    public DeleteUserHandler() {
        this.userRepository = new UserRepository();
    }

    public void execute(String userId) {
        userRepository.deleteUser(userId);
    }
}
