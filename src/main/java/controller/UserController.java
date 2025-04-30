
package controller;

import service.user.command.CreateUserHandler;
import service.user.command.UpdateUserHandler;
import service.user.command.DeleteUserHandler;
import service.user.query.GetAllUsersHandler;
import service.user.query.FindUserByIdHandler;
import model.User;
import java.util.List;
import javax.swing.JTable;
import repository.user.UserFileHandler;
import service.user.util.helpers.SelectUserTableHandler;
import service.user.util.helpers.ShowUserAndCreateTableHandler;
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
    UserFileHandler fileHandler = new UserFileHandler();
        List<User> users = fileHandler.readFromFile();

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
    
    public static void ShowUserController(JTable table) {
        UserFileHandler fileHandler = new UserFileHandler();
        List<User> users = fileHandler.readFromFile();
        ShowUserAndCreateTableHandler showUserTableHandler = new ShowUserAndCreateTableHandler();
        showUserTableHandler.showTable(table, users);
    }
    
    public static User SelectUserController(JTable table) {
    SelectUserTableHandler selectUserTableHandler = new SelectUserTableHandler();
    return selectUserTableHandler.selectElement(table);
    }
    public void createUser(User user) {
    createUserHandler.insert(user);
}

    public void updateUser(User user) {
    updateUserHandler.Update(user, null);
}

    public void deleteUser(String userId) {
        User user = new User();  // Creamos un usuario con el ID a eliminar
        user.setIdUser(userId);  // Establecemos el ID del usuario a eliminar
        deleteUserHandler.Delete(user);  // Ejecutamos el comando de eliminación
    }

    public List<User> getAllUsers() {
        return getAllUsersHandler.execute();
    }

    public User findUserById(String userId) {
        return findUserByIdHandler.execute(userId);
    }
}
