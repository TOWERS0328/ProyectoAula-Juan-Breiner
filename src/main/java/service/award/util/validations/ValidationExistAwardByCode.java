/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.award.util.validations;

import Interface.utils.validations.IExistRegister;
import java.util.List;
import model.Award;
import repository.award.AwardFileHandler;

/**
 *
 * @author Breiner
 */
public class ValidationExistAwardByCode implements IExistRegister<String> {

    @Override
    public boolean exist(String codeAward) {
        AwardFileHandler fileHandler = new AwardFileHandler();
        List<Award> awards = fileHandler.readFromFile();

        for (Award award : awards) {
            if (award.getCode().equalsIgnoreCase(codeAward)) {
                return true;
            }
        }
        return false;
    }
}

