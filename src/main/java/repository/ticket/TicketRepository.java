/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository.ticket;

import java.util.List;
import model.RedemptionTicket;

/**
 *
 * @author Breiner
 */
public class TicketRepository {
    private final TicketFileHandler fileHandler;

    public TicketRepository() {
        this.fileHandler = new TicketFileHandler();
    }

    public void enqueueTicket(RedemptionTicket ticket) {
        List<RedemptionTicket> currentTickets = fileHandler.readFromFile();
        currentTickets.add(ticket); // Encolar al final
        fileHandler.saveToFile(currentTickets);
    }

    public RedemptionTicket dequeueTicket() {
        List<RedemptionTicket> currentTickets = fileHandler.readFromFile();
        if (currentTickets.isEmpty()) return null;

        RedemptionTicket attended = currentTickets.remove(0); // Desencolar
        fileHandler.saveToFile(currentTickets);
        return attended;
    }

    public List<RedemptionTicket> getAllTickets() {
        return fileHandler.readFromFile();
    }

    public int generateNextTicketNumber() {
        List<RedemptionTicket> tickets = fileHandler.readFromFile();
        if (tickets.isEmpty()) return 1;

        int lastNumber = tickets.get(tickets.size() - 1).getTicketNumber();
        return lastNumber + 1;
    }
}