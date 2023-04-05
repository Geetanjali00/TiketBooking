package com.example.SpringProject.Entity;


import javax.persistence.*;

@Entity
@Table(name="ticket")


public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    @Column(name = "Ticket_id", length = 50)
    private int ticketid;
    @Column(name = "Passenger_Name",length = 50)
    private String passengername;
    @Column(name = "Passenger_Source",length = 50)
    private String passengersource;
    @Column(name = "Passenger_Dest",length = 50)
    private  String passengerdest;
    @Column(name = "Passenger_Mobile",length = 10)
    private int mobile;


    public Ticket(int ticketid, String passengername, String passengersource, String passengerdest, int mobile) {
        this.ticketid = ticketid;
        this.passengername = passengername;
        this.passengersource = passengersource;
        this.passengerdest = passengerdest;
        this.mobile = mobile;
    }




    public Ticket() {
    }

    public Ticket(int ticketid, Object o, String getpassengername, String getpassengersource, String getpassengerdest, int mobile) {
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
        return "Ticket{" +
                "ticketid=" + ticketid +
                ", passengername='" + passengername + '\'' +
                ", passengersource='" + passengersource + '\'' +
                ", passengerdest='" + passengerdest + '\'' +
                ", mobile=" + mobile +
                '}';
    }
}
