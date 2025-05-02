/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository.award;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import model.Award;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class AwardFileHandler {
    private static final String FILE_NAME = "awards.json";
    private final Gson gson = new Gson();

    public void saveToFile(List<Award> awards) {
        try (Writer writer = new FileWriter(FILE_NAME)) {
            gson.toJson(awards, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Award> readFromFile() {
        try (Reader reader = new FileReader(FILE_NAME)) {
            Type listType = new TypeToken<ArrayList<Award>>() {}.getType();
            return gson.fromJson(reader, listType);
        } catch (FileNotFoundException e) {
            return new ArrayList<>();
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
}
