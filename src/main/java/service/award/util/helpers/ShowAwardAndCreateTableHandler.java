/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.award.util.helpers;

import Interface.utils.helpers.IShowElementAndCreateTable;
import model.Award;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.util.List;

public class ShowAwardAndCreateTableHandler implements IShowElementAndCreateTable<Award> {
    @Override
    public void showTable(JTable table, List<Award> list) {

        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        TableRowSorter<TableModel> alphabeticOrder = new TableRowSorter<>(model);
        table.setRowSorter(alphabeticOrder);

        model.addColumn("Code");
        model.addColumn("Name");
        model.addColumn("category");
        model.addColumn("Points");
        table.setModel(model);

        String[] dataList = new String[4];

        try {
            if (list.isEmpty()) {
                JOptionPane.showMessageDialog(null, "There are no prizes available to display");
                return;
            } else {
                for (Award award : list) {
                    dataList[0] = award.getCode();
                    dataList[1] = award.getName();
                    dataList[2] = award.getCategory();
                    dataList[3] = String.valueOf(award.getPoints());
                    model.addRow(dataList);
                }
                table.setModel(model);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}

