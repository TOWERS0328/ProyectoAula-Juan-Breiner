/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import javax.swing.JOptionPane;
import model.User;
import repository.user.UserFileHandler;

public class ProfileController {
    private static String cedula;

    public static String getCedula() {
        return cedula;
    }

    public static void setCedula(String cedula) {
        ProfileController.cedula = cedula;
    }
    
     public static User getProfile() {
        if (cedula == null || cedula.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No user ID found in session.");
            return null;
        }

        UserFileHandler handler = new UserFileHandler();
        List<User> users = handler.readFromFile();

        for (User user : users) {
            if (user.getIdUser().equals(cedula)) {
                return user;
            }
        }
        return null;
    }

    public static void updateProfile(User updatedUser, String currentId) {
        UserFileHandler handler = new UserFileHandler();
        List<User> users = handler.readFromFile();

        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getIdUser().equals(currentId)) {
                users.set(i, updatedUser);
                handler.saveToFile(users);
                JOptionPane.showMessageDialog(null, "Profile updated successfully.");
                return;
            }
        }

        JOptionPane.showMessageDialog(null, "User not found. No changes made.");
    }
    
    public static void insertPoints(int pointsToAdd) {
    if (cedula == null || cedula.trim().isEmpty()) {
        JOptionPane.showMessageDialog(null, "No user ID found in session.");
        return;
    }

    UserFileHandler handler = new UserFileHandler();
    List<User> users = handler.readFromFile();

    for (int i = 0; i < users.size(); i++) {
        User user = users.get(i);
        if (user.getIdUser().equals(cedula)) {
            int currentPoints = user.getPoints(); // Asegúrate de tener este getter
            user.setPoints(currentPoints + pointsToAdd); // Asegúrate de tener este setter
            users.set(i, user);
            handler.saveToFile(users);
            JOptionPane.showMessageDialog(null, "Points added successfully.");
            return;
        }
    }

    JOptionPane.showMessageDialog(null, "User not found. Points not added.");
}
}
    
    
