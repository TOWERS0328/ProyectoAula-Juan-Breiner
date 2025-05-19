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
import repository.ticket.PersonalTicketRepository;
import service.ticket.util.helpers.ShowTicketHistoyInLabelsHandler;
import service.ticket.util.helpers.ShowTicketInfoInLabelsHandler;
import service.ticket.util.helpers.ShowUserHistoryAndCreateTableHandler;

public class TicketController {

    private static final TicketRepository repository = new TicketRepository();
    private static final PersonalTicketRepository personalRepository = new PersonalTicketRepository();

    public static RedemptionTicket generateAndEnqueueTicket(String userId, String userName, String awardName) {
        int ticketNumber = repository.generateNextTicketNumber();
        RedemptionTicket ticket = new RedemptionTicket(ticketNumber, userName, userId, awardName);
        repository.enqueueTicket(ticket);
        personalRepository.pushTicket(userId, ticket);
        return ticket;
    }

    public static RedemptionTicket attendNextTicket() {
        return repository.dequeueTicket();
    }
    
    public java.util.List<RedemptionTicket> getUserHistory(String userId) {
        return personalRepository.getUserTickets(userId);
    }

    public static void showTicketsInTable(JTable table) {
        List<RedemptionTicket> tickets = repository.getAllTickets();
        ShowTicketAndCreateTableHandler handler = new ShowTicketAndCreateTableHandler();
        handler.showTable(table, tickets);
    }
    
    public static void showFirstTicketInLabels(JTable table, JLabel lblTicketNumber, JLabel lblUserName, JLabel lblUserId, JLabel lblAwardName) {
    ShowTicketInfoInLabelsHandler.showFirstTicketInLabels(table, lblTicketNumber, lblUserName, lblUserId, lblAwardName);
    }
    
    public static void showUserFirstTicketInLabels(String userId,
                                               JLabel lblTicketNumber,
                                               JLabel lblUserName,
                                               JLabel lblUserId,
                                               JLabel lblAwardName,
                                               JLabel lblDate) {
    List<RedemptionTicket> userTickets = personalRepository.getUserTickets(userId);
    ShowTicketHistoyInLabelsHandler.showFirstTicketHistoryInLabels(userTickets, lblTicketNumber, lblUserName, lblUserId, lblAwardName, lblDate);
    }

    
    public static void showUserHistoryInTable(String userId, JTable table) {
    List<RedemptionTicket> userTickets = personalRepository.getUserTickets(userId);
    ShowUserHistoryAndCreateTableHandler handler = new ShowUserHistoryAndCreateTableHandler();
    handler.showTable(table, userTickets);
}

    public static List<RedemptionTicket> getAllTickets() {
        return repository.getAllTickets();
    }
}