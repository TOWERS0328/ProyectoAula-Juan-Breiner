/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.residue.command;

import Interface.command.IDelete;
import model.Residue;
import repository.residue.ResidueRepository;

public class DeleteResidueHandler implements IDelete<Residue> {

    private final ResidueRepository residueRepository;

    public DeleteResidueHandler() {
        this.residueRepository = new ResidueRepository();
    }

    @Override
    public void Delete(Residue residue) {
        residueRepository.deleteResidue(residue.getCode());
    }
}
