package repository.user;

import model.User;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    private List<User> users;

    public UserRepository() {
        users = new ArrayList<>();
    }

    public void saveUser(User user) {
        users.add(user);
    }

    public User findUserByIdUser(String idUser) {
        for (User user : users) {
            if (user.getIdUser().equals(idUser)) {
                return user;
            }
        }
        return null;
    }

    public void updateUser(User updatedUser) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getIdUser().equals(updatedUser.getIdUser())) {
                users.set(i, updatedUser);
                return;
            }
        }
    }

    public void deleteUser(String idUser) {
        users.removeIf(user -> user.getIdUser().equals(idUser));
    }

    public List<User> getAllUsers() {
        return users;
    }

    public void saveUsersToFile(String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(users);
            System.out.println("Usuarios guardados correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    public void loadUsersFromFile(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            users = (List<User>) ois.readObject();
            System.out.println("Usuarios cargados correctamente.");
        } catch (IOException | ClassNotFoundException e) {
            users = new ArrayList<>();
            System.out.println("No se pudo cargar el archivo. Lista vacía inicializada.");
        }
    }
}
