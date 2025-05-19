/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.award.query;

import Interface.query.IGetAll;
import java.util.List;
import model.Award;
import repository.award.AwardRepository;

/**
 *
 * @author Breiner
 */
public class GetAllAwardHandler implements IGetAll<Award> {

    private final AwardRepository repository;

    public GetAllAwardHandler() {
        this.repository = new AwardRepository();
    }

    @Override
    public List<Award> getAll() {
        return repository.getAllAwards();
    }
}
