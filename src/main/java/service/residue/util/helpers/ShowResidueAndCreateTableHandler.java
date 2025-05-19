package service.residue.util.helpers;

import Interface.utils.helpers.IShowElementAndCreateTable;
import model.Residue;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.util.List;

public class ShowResidueAndCreateTableHandler implements IShowElementAndCreateTable<Residue> {
    @Override
    public void showTable(JTable table, List<Residue> list) {

        //table structure
        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Prevent editing of cells
            }
        };
        
        TableRowSorter<TableModel> alphabeticOrder = new TableRowSorter<TableModel>(model);
        table.setRowSorter(alphabeticOrder);
        
        model.addColumn("Code");
        model.addColumn("Type");
        model.addColumn("Objet");
        model.addColumn("Points");
        table.setModel(model);

        String[] dataList = new String[4];

        try {
            if (list.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No residues available to display");
                return;
            } else {
                for (Residue residue : list) {
                    dataList[0] = residue.getCode();
                    dataList[1] = residue.getType();
                    dataList[2] = residue.getObject();
                    dataList[3] = String.valueOf(residue.getPoints());
                    model.addRow(dataList);
                }
                table.setModel(model);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}