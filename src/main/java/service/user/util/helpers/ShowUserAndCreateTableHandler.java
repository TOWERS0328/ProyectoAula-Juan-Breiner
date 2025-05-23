package service.user.util.helpers;

import Interface.utils.helpers.IShowElementAndCreateTable;
import model.User;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.util.List;

public class ShowUserAndCreateTableHandler implements IShowElementAndCreateTable<User> {

    @Override
    public void showTable(JTable table, List<User> list) {

        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        TableRowSorter<TableModel> alphabeticOrder = new TableRowSorter<>(model);
        table.setRowSorter(alphabeticOrder);

        model.addColumn("ID");   
        model.addColumn("Name");   
        model.addColumn("Last name");
        model.addColumn("Password");
        model.addColumn("Email");    
        model.addColumn("Carrer");  
        model.addColumn("Points");  

        table.setModel(model);

        try {
            if (list.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No users available");
                return;
            } else {
                for (User user : list) {
                    Object[] dataList = new Object[7];
                    dataList[0] = user.getIdUser();
                    dataList[1] = user.getName();
                    dataList[2] = user.getLastName();
                    dataList[3] = user.getPassword();
                    dataList[4] = user.getEmail();
                    dataList[5] = user.getCareer();
                    dataList[6] = user.getPoints();

                    model.addRow(dataList);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error displaying users: " + e.getMessage());
        }
    }
}
