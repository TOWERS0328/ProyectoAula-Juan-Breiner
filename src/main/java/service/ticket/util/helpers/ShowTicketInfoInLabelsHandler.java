/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.ticket.util.helpers;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Breiner
 */
public class ShowTicketInfoInLabelsHandler {
    public static void showFirstTicketInLabels(JTable table, JLabel lblTicketNumber, JLabel lblUserName, JLabel lblUserId, JLabel lblAwardName) {
        if (table.getRowCount() == 0) {
            lblTicketNumber.setText("No tickets");
            lblUserName.setText("-");
            lblUserId.setText("-");
            lblAwardName.setText("-");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) table.getModel();
        lblTicketNumber.setText(model.getValueAt(0, 0).toString());
        lblUserName.setText(model.getValueAt(0, 1).toString());
        lblUserId.setText(model.getValueAt(0, 2).toString());
        lblAwardName.setText(model.getValueAt(0, 3).toString());
    }
}

