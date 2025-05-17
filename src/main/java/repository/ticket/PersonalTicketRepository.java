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

    // Añadir (PUSH) un ticket al historial
    public void pushTicket(String userId, RedemptionTicket ticket) {
        List<RedemptionTicket> tickets = fileHandler.readFromFile(userId);
        tickets.add(ticket); // al final como pila
        fileHandler.saveToFile(userId, tickets);
    }

    // Eliminar el último ticket (POP)
    public RedemptionTicket popTicket(String userId) {
        List<RedemptionTicket> tickets = fileHandler.readFromFile(userId);
        if (tickets.isEmpty()) return null;

        RedemptionTicket last = tickets.remove(tickets.size() - 1);
        fileHandler.saveToFile(userId, tickets);
        return last;
    }

    // Ver historial completo (sin eliminar)
    public List<RedemptionTicket> getUserTickets(String userId) {
        return fileHandler.readFromFile(userId);
    }

    // Ver último ticket sin eliminar
    public RedemptionTicket peekTicket(String userId) {
        List<RedemptionTicket> tickets = fileHandler.readFromFile(userId);
        if (tickets.isEmpty()) return null;
        return tickets.get(tickets.size() - 1);
    }

    // Vaciar historial
    public void clearTickets(String userId) {
        fileHandler.saveToFile(userId, new ArrayList<>());
    }
}
