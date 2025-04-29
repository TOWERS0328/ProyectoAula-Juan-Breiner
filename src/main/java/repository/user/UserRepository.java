package repository.user;

import model.User;

import java.util.List;
import java.util.stream.Collectors;

public class UserRepository {
    private final UserFileHandler fileHandler;

    public UserRepository() {
        this.fileHandler = new UserFileHandler();
    }

    public void saveUser(User user) {
        List<User> users = fileHandler.readFromFile();
        users.add(user);
        fileHandler.saveToFile(users);
    }

    public User findUserByIdUser(String idUser) {
        return fileHandler.readFromFile().stream()
                .filter(user -> user.getIdUser().equals(idUser))
                .findFirst()
                .orElse(null);
    }

    public void updateUser(User updatedUser) {
        List<User> users = fileHandler.readFromFile();
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getIdUser().equals(updatedUser.getIdUser())) {
                users.set(i, updatedUser);
                break;
            }
        }
        fileHandler.saveToFile(users);
    }

    public void deleteUser(String idUser) {
        List<User> users = fileHandler.readFromFile();
        users = users.stream()
                .filter(user -> !user.getIdUser().equals(idUser))
                .collect(Collectors.toList());
        fileHandler.saveToFile(users);
    }

    public List<User> getAllUsers() {
        return fileHandler.readFromFile();
    }
}