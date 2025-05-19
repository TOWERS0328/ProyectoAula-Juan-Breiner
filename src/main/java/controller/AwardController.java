/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import service.award.command.CreateAwardHandler;
import service.award.command.UpdateAwardHandler;
import service.award.command.DeleteAwardHandler;
import service.award.query.GetAllAwardHandler;
import service.award.query.FindAwardByCodeHandler;
import model.Award;

import java.util.List;
import javax.swing.JTable;

import repository.award.AwardFileHandler;
import service.award.util.helpers.SelectAwardTableHandler;
import service.award.util.helpers.ShowAwardAndCreateTableHandler;

public class AwardController {

    private final CreateAwardHandler createAwardHandler;
    private final UpdateAwardHandler updateAwardHandler;
    private final DeleteAwardHandler deleteAwardHandler;
    private final GetAllAwardHandler getAllAwardsHandler;
    private final FindAwardByCodeHandler getAwardByCodeHandler;

    public AwardController() {
        this.createAwardHandler = new CreateAwardHandler();
        this.updateAwardHandler = new UpdateAwardHandler();
        this.deleteAwardHandler = new DeleteAwardHandler();
        this.getAllAwardsHandler = new GetAllAwardHandler();
        this.getAwardByCodeHandler = new FindAwardByCodeHandler();
    }

    public static void showAwardController(JTable table) {
        AwardFileHandler fileHandler = new AwardFileHandler();
        List<Award> awards = fileHandler.readFromFile();
        ShowAwardAndCreateTableHandler showAwardTableHandler = new ShowAwardAndCreateTableHandler();
        showAwardTableHandler.showTable(table, awards);
    }

    public static Award selectAwardController(JTable table) {
        SelectAwardTableHandler selectAwardTableHandler = new SelectAwardTableHandler();
        return selectAwardTableHandler.selectElement(table);
    }

    public void createAward(Award award) {
        createAwardHandler.insert(award);
    }

    public void updateAward(Award award) {
        updateAwardHandler.Update(award, null);
    }

    public void deleteAward(String awardCode) {
        Award award = new Award();
        award.setCode(awardCode);
        deleteAwardHandler.Delete(award);
    }
    
    public List<Award> getAllAwards() {
    return getAllAwardsHandler.getAll();
    }

    public Award findAwardByCode(String awardCode) {
    return getAwardByCodeHandler.findById(awardCode);
    }
}
