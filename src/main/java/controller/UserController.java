
package controller;

import service.command.CreateUserHandler;
import service.command.UpdateUserHandler;
import service.command.DeleteUserHandler;
import service.query.GetAllUsersHandler;
import service.query.FindUserByIdHandler;
import model.User;
import java.util.List;
import util.LoginRequest;

public class UserController {

    private final CreateUserHandler createUserHandler;
    private final UpdateUserHandler updateUserHandler;
    private final DeleteUserHandler deleteUserHandler;
    private final GetAllUsersHandler getAllUsersHandler;
    private final FindUserByIdHandler findUserByIdHandler;

    public UserController() {
        this.createUserHandler = new CreateUserHandler();
        this.updateUserHandler = new UpdateUserHandler();
        this.deleteUserHandler = new DeleteUserHandler();
        this.getAllUsersHandler = new GetAllUsersHandler();
        this.findUserByIdHandler = new FindUserByIdHandler();
    }
    
    public static String loginController(LoginRequest request) {
    UserController controller = new UserController();
    List<User> users = controller.getAllUsers(); // Lee usuarios desde archivo

    if (request.getIdUser().equals("sudo") && request.getPassword().equals("sudo")) {
        return "admin";
    }

    for (User user : users) {
        if (user.getIdUser().equals(request.getIdUser()) && user.getPassword().equals(request.getPassword())) {
            return "user";
        }
    }

    return "NN"; // No encontrado
}

    public void createUser(User user) {
        createUserHandler.execute(user);
    }

    public void updateUser(User user) {
        updateUserHandler.execute(user);
    }

    public void deleteUser(String userId) {
        deleteUserHandler.execute(userId);
    }

    public List<User> getAllUsers() {
        return getAllUsersHandler.execute();
    }

    public User findUserById(String userId) {
        return findUserByIdHandler.execute(userId);
    }
}
