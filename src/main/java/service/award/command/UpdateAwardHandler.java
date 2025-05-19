/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.award.command;

import Interface.command.IUpdate;
import model.Award;
import repository.award.AwardRepository;

public class UpdateAwardHandler implements IUpdate<Award, Void> {

    private final AwardRepository awardRepository;

    public UpdateAwardHandler() {
        this.awardRepository = new AwardRepository();
    }

    @Override
    public void Update(Award award, Void unused) {
        awardRepository.updateAward(award);
    }
}
