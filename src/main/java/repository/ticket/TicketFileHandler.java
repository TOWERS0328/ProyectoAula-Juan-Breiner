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

public class TicketFileHandler {
    private static final String FILE_NAME = "tickets.json";
    private final Gson gson = new Gson();

    public void saveToFile(List<RedemptionTicket> tickets) {
        try (Writer writer = new FileWriter(FILE_NAME)) {
            gson.toJson(tickets, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<RedemptionTicket> readFromFile() {
        try (Reader reader = new FileReader(FILE_NAME)) {
            Type listType = new TypeToken<ArrayList<RedemptionTicket>>() {}.getType();
            List<RedemptionTicket> tickets = gson.fromJson(reader, listType);
            return tickets != null ? tickets : new ArrayList<>();
        } catch (FileNotFoundException e) {
            return new ArrayList<>();
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
}
