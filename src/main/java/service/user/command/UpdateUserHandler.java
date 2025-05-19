package service.user.command;

import Interface.command.IUpdate;
import model.User;
import repository.user.UserRepository;

public class UpdateUserHandler implements IUpdate<User, Void> {

    private final UserRepository userRepository;

    public UpdateUserHandler() {
        this.userRepository = new UserRepository();
    }

    @Override
    public void Update(User user, Void unused) {
        userRepository.updateUser(user);
    }
    }
