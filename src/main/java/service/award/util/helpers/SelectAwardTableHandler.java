/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.award.util.helpers;

import Interface.utils.helpers.ISelectElementTable;
import model.Award;

import javax.swing.*;

public class SelectAwardTableHandler implements ISelectElementTable<Award> {
    @Override
    public Award selectElement(JTable table) {
        Award selectedAward = null;

        int selectedRow = table.getSelectedRow();
        if (selectedRow != -1) {
            String code = table.getValueAt(selectedRow, 0).toString();
            String name = table.getValueAt(selectedRow, 1).toString();
            String category = table.getValueAt(selectedRow, 2).toString();
            int points = Integer.parseInt(table.getValueAt(selectedRow, 3).toString());

            selectedAward = new Award();
            selectedAward.setCode(code);
            selectedAward.setName(name);
            selectedAward.setCategory(category);
            selectedAward.setPoints(points);
        } else {
            JOptionPane.showMessageDialog(null, "You need to select an award");
        }

        return selectedAward;
    }
}
