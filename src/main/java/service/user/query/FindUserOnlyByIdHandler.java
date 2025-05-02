/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.user.query;

import model.User;
import repository.user.UserFileHandler;
import repository.user.UserRepository;

public class FindUserOnlyByIdHandler {

    private final UserRepository userRepository;

    public FindUserOnlyByIdHandler() {
        this.userRepository = new UserRepository();
    }
    
    public User findById(String id) {
        UserFileHandler fileHandler = new UserFileHandler();
        for (User user : fileHandler.readFromFile()) {
            if (user.getIdUser().equals(id)) {
                return user;
            }
        }
        return null;
    }
}
