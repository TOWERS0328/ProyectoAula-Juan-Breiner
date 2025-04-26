import model.User;
import repository.user.UserRepository;
import view.publico.ViewInicial;

import java.util.List;

public class Principal {

    public static void main(String[] args) {
        // 🧠 Crear repositorio
        UserRepository repo = new UserRepository();

        // 📂 Cargar usuarios desde archivo
        repo.loadUsersFromFile("usuarios.dat");

        // 💾 Guardar usuarios al salir
        repo.saveUsersToFile("usuarios.dat");

        // 📃 Mostrar usuarios en consola
        List<User> loadedUsers = repo.getAllUsers();
        System.out.println("📂 Usuarios cargados desde usuarios.dat:");
        for (User u : loadedUsers) {
            System.out.println(u);
        }

        // 🪟 Mostrar ventana inicial
        ViewInicial v = new ViewInicial();
        v.setLocationRelativeTo(null);
        v.setVisible(true);
    }
}
