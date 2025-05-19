package service.residue.query;

import Interface.query.IGetAll;
import java.util.List;
import model.Residue;
import repository.residue.ResidueRepository;

public class GetAllResiduesHandler implements IGetAll<Residue> {
    private final ResidueRepository repository;

    public GetAllResiduesHandler() {
        this.repository = new ResidueRepository();
    }

    @Override
    public List<Residue> getAll() {
        return repository.getAllResidues();
    }
}
