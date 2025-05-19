/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository.ticket;

import java.util.ArrayList;
import model.RedemptionTicket;

import java.util.List;

public class PersonalTicketRepository {
    private final PersonalTicketFileHandler fileHandler;

    public PersonalTicketRepository() {
        this.fileHandler = new PersonalTicketFileHandler();
    }

    public void pushTicket(String userId, RedemptionTicket ticket) {
        List<RedemptionTicket> tickets = fileHandler.readFromFile(userId);
        tickets.add(ticket);
        fileHandler.saveToFile(userId, tickets);
    }

    public RedemptionTicket popTicket(String userId) {
        List<RedemptionTicket> tickets = fileHandler.readFromFile(userId);
        if (tickets.isEmpty()) return null;

        RedemptionTicket last = tickets.remove(tickets.size() - 1);
        fileHandler.saveToFile(userId, tickets);
        return last;
    }

    public List<RedemptionTicket> getUserTickets(String userId) {
        return fileHandler.readFromFile(userId);
    }

    public void clearTickets(String userId) {
        fileHandler.saveToFile(userId, new ArrayList<>());
    }
}
