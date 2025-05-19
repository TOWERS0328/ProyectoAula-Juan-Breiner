/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.ticket.util.helpers;

import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.RedemptionTicket;

/**
 *
 * @author Breiner
 */
public class ShowTicketHistoyInLabelsHandler {
    public static void showFirstTicketHistoryInLabels(List<RedemptionTicket> tickets,
                                                      JLabel lblTicketNumber,
                                                      JLabel lblUserName,
                                                      JLabel lblUserId,
                                                      JLabel lblAwardName,
                                                      JLabel lblDate) {
        if (tickets.isEmpty()) {
            lblTicketNumber.setText("No redemptions");
            lblUserName.setText("-");
            lblUserId.setText("-");
            lblAwardName.setText("-");
            lblDate.setText("-");
            return;
        }

        RedemptionTicket ticket = tickets.get(0);
        lblTicketNumber.setText(String.format("%02d", ticket.getTicketNumber()));
        lblUserName.setText(ticket.getUserName());
        lblUserId.setText(ticket.getUserId());
        lblAwardName.setText(ticket.getAwardName());

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        lblDate.setText(dateFormat.format(ticket.getRedemptionDate()));
    }
}
