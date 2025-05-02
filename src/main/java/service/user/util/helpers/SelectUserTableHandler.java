package service.user.util.helpers;

import Interface.utils.helpers.ISelectElementTable;
import model.User;

import javax.swing.*;

public class SelectUserTableHandler implements ISelectElementTable<User> {
    @Override
    public User selectElement(JTable table) {
        User selectedUser = null;

        int selectedRow = table.getSelectedRow();
        if (selectedRow != -1) {
            String idUser = table.getValueAt(selectedRow, 0).toString();     
            String name = table.getValueAt(selectedRow, 1).toString();         
            String lastName = table.getValueAt(selectedRow, 2).toString();     
            String email = table.getValueAt(selectedRow, 3).toString();        
            String career = table.getValueAt(selectedRow, 4).toString();       
            int points = Integer.parseInt(table.getValueAt(selectedRow, 5).toString()); 

            String password = "";

            selectedUser = new User(idUser, name, lastName, password, email, career, points);
        } else {
            JOptionPane.showMessageDialog(null, "You need to select a user");
        }

        return selectedUser;
    }
}