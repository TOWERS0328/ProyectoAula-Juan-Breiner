import model.User;
import repository.user.UserRepository;
import view.publico.ViewInicial;

import java.util.List;

public class Principal {

    public static void main(String[] args) {
        // 🧠 Crear repositorio
        UserRepository repo = new UserRepository(); // ✅ Al construirlo ya carga de users.json

        // 📃 Mostrar usuarios en consola
        List<User> loadedUsers = repo.getAllUsers();
        System.out.println("📂 Usuarios cargados desde users.json:");
        for (User u : loadedUsers) {
            System.out.println(u);
        }

        // 🪟 Mostrar ventana inicial
        ViewInicial v = new ViewInicial();
        v.setLocationRelativeTo(null);
        v.setVisible(true);

        // 💾 Guardar usuarios al salir (opcional si haces cambios manualmente)
        // repo.saveUsersToFile(); → Esto NO lo necesitas aquí en main. Se guarda cuando creas, actualizas o eliminas.
    }
}
