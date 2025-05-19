/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.award.command;

import Interface.command.IDelete;
import model.Award;
import repository.award.AwardRepository;

public class DeleteAwardHandler implements IDelete<Award> {

    private final AwardRepository awardRepository;

    public DeleteAwardHandler() {
        this.awardRepository = new AwardRepository();
    }

    @Override
    public void Delete(Award award) {
        awardRepository.deleteAward(award.getCode());
    }
}
