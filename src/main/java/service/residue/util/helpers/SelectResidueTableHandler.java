package service.residue.util.helpers;

import Interface.utils.helpers.ISelectElementTable;
import model.Residue;

import javax.swing.*;

public class SelectResidueTableHandler implements ISelectElementTable<Residue> {
    @Override
    public Residue selectElement(JTable table) {
        Residue selectedResidue = null;

        int selectedRow = table.getSelectedRow();
        if (selectedRow != -1) {
            String code = table.getValueAt(selectedRow, 0).toString();
            String type = table.getValueAt(selectedRow, 1).toString();
            String object = table.getValueAt(selectedRow, 2).toString();
            int points = Integer.parseInt(table.getValueAt(selectedRow, 3).toString());

            // Creamos el objeto con setters
            selectedResidue = new Residue();
            selectedResidue.setCode(code);
            selectedResidue.setType(type);
            selectedResidue.setObject(object);
            selectedResidue.setPoints(points);

        } else {
            JOptionPane.showMessageDialog(null, "You need to select a residue");
        }

        return selectedResidue;
    }
}
