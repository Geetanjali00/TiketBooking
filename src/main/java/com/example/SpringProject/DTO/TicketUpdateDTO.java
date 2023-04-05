package com.example.SpringProject.DTO;

public class TicketUpdateDTO {
    private int ticketid;
    private String passengername;
    private String passengersource;
    private  String passengerdest;
    private int mobile;

    public TicketUpdateDTO(int ticketid,String passengername, String passengersource, String passengerdest, int mobile) {
        this.ticketid = ticketid;
        this.passengername = passengername;
        this.passengersource = passengersource;
        this.passengerdest = passengerdest;
        this.mobile = mobile;
    }

    public TicketUpdateDTO() {
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
        return "TicketSaveDTO{" +
                "ticketid='" + ticketid +
                ", passengername='" + passengername + '\'' +
                ", passengersource='" + passengersource + '\'' +
                ", passengerdest='" + passengerdest + '\'' +
                ", mobile=" + mobile +
                '}';
    }
}




