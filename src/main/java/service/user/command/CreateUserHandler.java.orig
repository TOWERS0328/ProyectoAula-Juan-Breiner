package service.user.command;

import Interface.command.IInsert;
import model.User;
import repository.user.UserRepository;

public class CreateUserHandler implements IInsert<User> {

    private final UserRepository userRepository;

    public CreateUserHandler() {
        this.userRepository = new UserRepository();
    }

    @Override
    public void insert(User user) {
        userRepository.saveUser(user);
        System.out.println("Usuario creado exitosamente.");
    }
}
