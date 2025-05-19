/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.ticket.util.helpers;

import Interface.utils.helpers.IShowElementAndCreateTable;
import model.RedemptionTicket;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.List;

public class ShowUserHistoryAndCreateTableHandler implements IShowElementAndCreateTable<RedemptionTicket> {

    @Override
   public void showTable(JTable table, List<RedemptionTicket> tickets) {
        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        TableRowSorter<TableModel> sorter = new TableRowSorter<>(model);
        table.setRowSorter(sorter);

        model.addColumn("Ticket #");
        model.addColumn("Name");
        model.addColumn("ID");
        model.addColumn("Prize");
        model.addColumn("Date");

        if (tickets.isEmpty()) {
            JOptionPane.showMessageDialog(null, "There are no tickets to display");
            table.setModel(model);
            return;
        }

        Collections.reverse(tickets);
        // Formato de fecha
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        for (RedemptionTicket ticket : tickets) {
            model.addRow(new Object[]{
                String.format("%02d", ticket.getTicketNumber()),
                ticket.getUserName(),
                ticket.getUserId(),
                ticket.getAwardName(),
                dateFormat.format(ticket.getRedemptionDate())
            });
        }

        table.setModel(model);
    }
}