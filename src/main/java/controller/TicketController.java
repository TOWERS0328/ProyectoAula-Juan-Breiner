/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.RedemptionTicket;
import repository.ticket.TicketRepository;
import service.ticket.util.helpers.ShowTicketAndCreateTableHandler;

import javax.swing.*;
import java.util.List;
import service.ticket.util.helpers.ShowTicketInfoInLabelsHandler;

public class TicketController {

    private static final TicketRepository repository = new TicketRepository();

    // Genera un nuevo ticket y lo encola
    public static RedemptionTicket generateAndEnqueueTicket(String userId, String userName, String awardName) {
        int ticketNumber = repository.generateNextTicketNumber();
        RedemptionTicket ticket = new RedemptionTicket(ticketNumber, userName, userId, awardName);
        repository.enqueueTicket(ticket);
        return ticket;
    }

    // Atiende el primer ticket en la cola
    public static RedemptionTicket attendNextTicket() {
        return repository.dequeueTicket();
    }

    // Muestra todos los tickets en la tabla
    public static void showTicketsInTable(JTable table) {
        List<RedemptionTicket> tickets = repository.getAllTickets();
        ShowTicketAndCreateTableHandler handler = new ShowTicketAndCreateTableHandler();
        handler.showTable(table, tickets);
    }
    
    public static void showFirstTicketInLabels(JTable table, JLabel lblTicketNumber, JLabel lblUserName, JLabel lblUserId, JLabel lblAwardName) {
    ShowTicketInfoInLabelsHandler.showFirstTicketInLabels(table, lblTicketNumber, lblUserName, lblUserId, lblAwardName);
}

    // Devuelve todos los tickets (opcional, si se requiere en alguna lógica externa)
    public static List<RedemptionTicket> getAllTickets() {
        return repository.getAllTickets();
    }
}