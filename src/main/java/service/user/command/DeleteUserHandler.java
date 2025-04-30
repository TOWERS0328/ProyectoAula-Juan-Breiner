package service.user.command;

import Interface.command.IDelete;
import model.User;
import repository.user.UserRepository;

public class DeleteUserHandler implements IDelete<User> {

    private final UserRepository userRepository;

    public DeleteUserHandler() {
        this.userRepository = new UserRepository();
    }

    @Override
    public void Delete(User user) {
        // Eliminar usuario con lógica de comando
        userRepository.deleteUser(user.getIdUser());
        System.out.println("Usuario eliminado exitosamente.");
    }
}
