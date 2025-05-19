package repository.user;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import model.User;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class UserFileHandler {
    private static final String FILE_NAME = "users.json";
    private final Gson gson = new Gson();

    public void saveToFile(List<User> users) {
        try (Writer writer = new FileWriter(FILE_NAME)) {
            gson.toJson(users, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<User> readFromFile() {

    try (Reader reader = new FileReader(FILE_NAME)) {
        Type userListType = new TypeToken<ArrayList<User>>() {}.getType();
        return gson.fromJson(reader, userListType);
    } catch (JsonSyntaxException | IllegalStateException e) {
        System.err.println("Formato JSON inválido en " + FILE_NAME + ": " + e.getMessage());
        return new ArrayList<>();
    } catch (IOException e) {
        e.printStackTrace();
        return new ArrayList<>();
    }
}

}
