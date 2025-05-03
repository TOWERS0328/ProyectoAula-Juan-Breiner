/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.user.util.validations;

import Interface.utils.validations.IExistRegister;
import model.User;
import repository.user.UserFileHandler;

import java.util.List;

public class ValidationExistUserById implements IExistRegister<String> {

    @Override
    public boolean exist(String idUser) {
        UserFileHandler fileHandler = new UserFileHandler();
        List<User> users = fileHandler.readFromFile();

        for (User user : users) {
            if (user.getIdUser().equals(idUser)) {
                return true;
            }
        }

        return false;
    }
}
