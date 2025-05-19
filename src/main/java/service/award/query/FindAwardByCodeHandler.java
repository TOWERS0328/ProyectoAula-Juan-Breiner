/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.award.query;

import Interface.query.IFindById;
import model.Award;
import repository.award.AwardRepository;

/**
 *
 * @author Breiner
 */
public class FindAwardByCodeHandler implements IFindById<String, Award> {

    private final AwardRepository repository;

    public FindAwardByCodeHandler() {
        this.repository = new AwardRepository();
    }

    @Override
    public Award findById(String code) {
        return repository.findAwardByCode(code);
    }
}
