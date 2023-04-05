package com.example.SpringProject.DTO;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class TicketDTO {

    private int ticketid;
    private String passengername;
    private String passengersource;
    private  String passengerdest;
    private int mobile;

    public TicketDTO(int ticketid, String passengername, String passengersource, String passengerdest, int mobile) {
        this.ticketid = ticketid;
        this.passengername = passengername;
        this.passengersource = passengersource;
        this.passengerdest = passengerdest;
        this.mobile = mobile;
    }

    public TicketDTO() {
    }

    public int getTicketid() {
        return ticketid;
    }

    public void setTicketid(int ticketid) {
        this.ticketid = ticketid;
    }

    public String getpassengername() {
        return passengername;
    }

    public void setpassengername(String passengername) {
        this.passengername = passengername;
    }

    public String getpassengersource() {
        return passengersource;
    }

    public void setpassengersource(String passengersource) {
        this.passengersource = passengersource;
    }

    public String getpassengerdest() {
        return passengerdest;
    }

    public void setpassengerdest(String passengerdest) {
        this.passengerdest = passengerdest;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }


    @Override
    public String toString() {
        return "TicketDTO{" +
                "ticketid=" + ticketid +
                ", passengername='" + passengername + '\'' +
                ", passengersource='" + passengersource + '\'' +
                ", passengerdest='" + passengerdest + '\'' +
                ", mobile=" + mobile +
                '}';
    }
}
