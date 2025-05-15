/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.residue.util.validations;

import Interface.utils.validations.IExistRegister;
import java.util.List;
import model.Residue;
import repository.residue.ResidueFileHandler;

/**
 *
 * @author Breiner
 */
public class ValidationExistResidueByCode implements IExistRegister<String> {

    @Override
    public boolean exist(String codeResidue) {
        ResidueFileHandler fileHandler = new ResidueFileHandler();
        List<Residue> residues = fileHandler.readFromFile();

        for (Residue residue : residues) {
            if (residue.getCode().equals(codeResidue)) {
                return true;
            }
        }

        return false;
    }
}
