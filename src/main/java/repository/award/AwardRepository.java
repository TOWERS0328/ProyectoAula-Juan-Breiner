/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository.award;

import model.Award;

import java.util.List;
import java.util.stream.Collectors;

public class AwardRepository {
    private final AwardFileHandler fileHandler;

    public AwardRepository() {
        this.fileHandler = new AwardFileHandler();
    }

    public void saveAward(Award award) {
        List<Award> awards = fileHandler.readFromFile();
        awards.add(award);
        fileHandler.saveToFile(awards);
    }

    public Award findAwardById(String idAward) {
        return fileHandler.readFromFile().stream()
                .filter(award -> award.getCode().equals(idAward))
                .findFirst()
                .orElse(null);
    }

    public void updateAward(Award updatedAward) {
        List<Award> awards = fileHandler.readFromFile();
        for (int i = 0; i < awards.size(); i++) {
            if (awards.get(i).getCode().equals(updatedAward.getCode())) {
                awards.set(i, updatedAward);
                break;
            }
        }
        fileHandler.saveToFile(awards);
    }

    public void deleteAward(String idAward) {
        List<Award> awards = fileHandler.readFromFile();
        awards = awards.stream()
                .filter(award -> !award.getCode().equals(idAward))
                .collect(Collectors.toList());
        fileHandler.saveToFile(awards);
    }

    public List<Award> getAllAwards() {
        return fileHandler.readFromFile();
    }
}