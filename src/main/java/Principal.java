import model.User;
import repository.user.UserRepository;
import view.publico.ViewInicial;

import java.util.List;

public class Principal {

    public static void main(String[] args) {
        
        UserRepository repo = new UserRepository();

        List<User> loadedUsers = repo.getAllUsers();
        System.out.println(" Usuarios cargados desde users.json:");
        for (User u : loadedUsers) {
            System.out.println(u);
        }

        ViewInicial v = new ViewInicial();
        v.setLocationRelativeTo(null);
        v.setVisible(true);

    }
}
