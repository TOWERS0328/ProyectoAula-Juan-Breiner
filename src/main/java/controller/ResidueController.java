/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import service.residue.command.CreateResidueHandler;
import service.residue.command.UpdateResidueHandler;
import service.residue.command.DeleteResidueHandler;
import service.residue.query.GetAllResiduesHandler;
import service.residue.query.FindResidueByCodeHandler;
import model.Residue;
import java.util.List;
import javax.swing.JTable;
import repository.residue.ResidueFileHandler;
import service.residue.util.helpers.SelectResidueTableHandler;
import service.residue.util.helpers.ShowResidueAndCreateTableHandler;

public class ResidueController {

    private final CreateResidueHandler createResidueHandler;
    private final UpdateResidueHandler updateResidueHandler;
    private final DeleteResidueHandler deleteResidueHandler;
    private final GetAllResiduesHandler getAllResiduesHandler;
    private final FindResidueByCodeHandler getResidueByCodeHandler;

    public ResidueController() {
        this.createResidueHandler = new CreateResidueHandler();
        this.updateResidueHandler = new UpdateResidueHandler();
        this.deleteResidueHandler = new DeleteResidueHandler();
        this.getAllResiduesHandler = new GetAllResiduesHandler();
        this.getResidueByCodeHandler = new FindResidueByCodeHandler();
    }

    // Mostrar todos los residuos en la tabla
    public static void showResidueController(JTable table) {
        ResidueFileHandler fileHandler = new ResidueFileHandler();
        List<Residue> residues = fileHandler.readFromFile();
        ShowResidueAndCreateTableHandler showResidueTableHandler = new ShowResidueAndCreateTableHandler();
        showResidueTableHandler.showTable(table, residues);
    }

    // Seleccionar un residuo de la tabla
    public static Residue selectResidueController(JTable table) {
    SelectResidueTableHandler selectResidueTableHandler = new SelectResidueTableHandler();
    return selectResidueTableHandler.selectElement(table);
}

    // Crear un residuo
    public void createResidue(Residue residue) {
        createResidueHandler.insert(residue);
    }

    public void updateResidue(Residue residue) {
        updateResidueHandler.Update(residue, null);
    }

    public void deleteResidue(String residueCode) {
        Residue residue = new Residue();
        residue.setCode(residueCode);
        deleteResidueHandler.Delete(residue);
    }

    /*public List<Residue> getAllResidues() {
        return getAllResiduesHandler.execute();
    }

    // Buscar un residuo por código
    public Residue findResidueByCode(String residueCode) {
        return getResidueByCodeHandler.execute(residueCode);
    }*/
}
