/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.award.command;

import Interface.command.IInsert;
import model.Award;
import repository.award.AwardRepository;

public class CreateAwardHandler implements IInsert<Award> {

    private final AwardRepository awardRepository;

    public CreateAwardHandler() {
        this.awardRepository = new AwardRepository();
    }

    @Override
    public void insert(Award award) {
        awardRepository.saveAward(award);
        System.out.println("Premio creado exitosamente.");
    }
}
