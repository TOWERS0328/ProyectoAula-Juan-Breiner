package service.query;

import model.User;
import repository.user.UserRepository;

public class FindUserByIdHandler {

    private final UserRepository userRepository;

    public FindUserByIdHandler() {
        this.userRepository = new UserRepository();
    }

    public User execute(String userId) {
        return userRepository.findUserByIdUser(userId);
    }
}
