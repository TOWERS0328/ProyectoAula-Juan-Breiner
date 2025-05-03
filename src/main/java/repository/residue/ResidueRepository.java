/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository.residue;

import model.Residue;

import java.util.List;
import java.util.stream.Collectors;

public class ResidueRepository {
    private final ResidueFileHandler fileHandler;

    public ResidueRepository() {
        this.fileHandler = new ResidueFileHandler();
    }

    public void saveResidue(Residue residue) {
        List<Residue> residues = fileHandler.readFromFile();
        residues.add(residue);
        fileHandler.saveToFile(residues);
    }

    public Residue findResidueByCode(String code) {
        return fileHandler.readFromFile().stream()
                .filter(residue -> residue.getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElse(null);
    }

    public void updateResidue(Residue updatedResidue) {
        List<Residue> residues = fileHandler.readFromFile();
        for (int i = 0; i < residues.size(); i++) {
            if (residues.get(i).getCode().equalsIgnoreCase(updatedResidue.getCode())) {
                residues.set(i, updatedResidue);
                break;
            }
        }
        fileHandler.saveToFile(residues);
    }

    public void deleteResidue(String code) {
        List<Residue> residues = fileHandler.readFromFile();
        residues = residues.stream()
                .filter(residue -> !residue.getCode().equalsIgnoreCase(code))
                .collect(Collectors.toList());
        fileHandler.saveToFile(residues);
    }

    public List<Residue> getAllResidues() {
        return fileHandler.readFromFile();
    }
}