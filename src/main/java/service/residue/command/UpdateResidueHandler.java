/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.residue.command;

import Interface.command.IUpdate;
import model.Residue;
import repository.residue.ResidueRepository;

public class UpdateResidueHandler implements IUpdate<Residue, Void> {

    private final ResidueRepository residueRepository;

    public UpdateResidueHandler() {
        this.residueRepository = new ResidueRepository();
    }

    @Override
    public void Update(Residue residue, Void unused) {
        residueRepository.updateResidue(residue);
    }
}
