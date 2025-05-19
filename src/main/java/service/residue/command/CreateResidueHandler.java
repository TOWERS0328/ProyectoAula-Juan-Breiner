package service.residue.command;

import Interface.command.IInsert;
import model.Residue;
import repository.residue.ResidueRepository;

public class CreateResidueHandler implements IInsert<Residue> {

    private final ResidueRepository residueRepository;

    public CreateResidueHandler() {
        this.residueRepository = new ResidueRepository();
    }

    @Override
    public void insert(Residue residue) {
        residueRepository.saveResidue(residue);
    }
}