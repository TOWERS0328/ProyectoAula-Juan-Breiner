/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.residue.query;

import Interface.query.IFindById;
import model.Residue;
import repository.residue.ResidueRepository;

/**
 *
 * @author Breiner
 */
public class FindResidueByCodeHandler implements IFindById<String,Residue> {
    private final ResidueRepository repository;

    public FindResidueByCodeHandler() {
        this.repository = new ResidueRepository();
    }

    @Override
    public Residue findById(String code) {
        return repository.findResidueByCode(code);
    }

    }
