/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author Breiner
 */
public class RedemptionTicket {
    private int ticketNumber;
    private String userName;
    private String userId;
    private String awardName;
    private Date redemptionDate;

    public RedemptionTicket(int ticketNumber, String userName, String userId, String awardName) {
        this.ticketNumber = ticketNumber;
        this.userName = userName;
        this.userId = userId;
        this.awardName = awardName;
        this.redemptionDate = new Date(); 
    }
    public int getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAwardName() {
        return awardName;
    }

    public void setAwardName(String awardName) {
        this.awardName = awardName;
    }

    public Date getRedemptionDate() {
        return redemptionDate;
    }

    public void setRedemptionDate(Date redemptionDate) {
        this.redemptionDate = redemptionDate;
    }
    
    
    
}
