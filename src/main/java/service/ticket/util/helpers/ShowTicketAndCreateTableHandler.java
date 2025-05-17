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
import java.util.List;

/**
 *
 * @author Breiner
 */
public class ShowTicketAndCreateTableHandler implements IShowElementAndCreateTable<RedemptionTicket> {

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
        model.addColumn("Nombre");
        model.addColumn("Cédula");
        model.addColumn("Premio");

        if (tickets.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay tickets en cola para mostrar.");
            table.setModel(model);
            return;
        }

        for (RedemptionTicket ticket : tickets) {
            model.addRow(new Object[]{
                String.format("%02d", ticket.getTicketNumber()),
                ticket.getUserName(),
                ticket.getUserId(),
                ticket.getAwardName()
            });
        }

        table.setModel(model);
    }
    }
