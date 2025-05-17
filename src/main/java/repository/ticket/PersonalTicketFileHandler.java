/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository.ticket;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import model.RedemptionTicket;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class PersonalTicketFileHandler {
    private final Gson gson = new Gson();

    // ruta base para los archivos de cada usuario
    private final String BASE_PATH = "user_tickets/";

    public List<RedemptionTicket> readFromFile(String userId) {
        File dir = new File(BASE_PATH);
        if (!dir.exists()) {
            dir.mkdirs();
        }

        File file = new File(BASE_PATH + userId + ".json");
        if (!file.exists()) {
            return new ArrayList<>();
        }

        try (Reader reader = new FileReader(file)) {
            Type listType = new TypeToken<ArrayList<RedemptionTicket>>() {}.getType();
            List<RedemptionTicket> tickets = gson.fromJson(reader, listType);
            return tickets != null ? tickets : new ArrayList<>();
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    public void saveToFile(String userId, List<RedemptionTicket> tickets) {
        File dir = new File(BASE_PATH);
        if (!dir.exists()) {
            dir.mkdirs();
        }

        try (Writer writer = new FileWriter(BASE_PATH + userId + ".json")) {
            gson.toJson(tickets, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}