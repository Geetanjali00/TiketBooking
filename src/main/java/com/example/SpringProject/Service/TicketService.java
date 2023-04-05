package com.example.SpringProject.Service;

import com.example.SpringProject.DTO.TicketDTO;
import com.example.SpringProject.DTO.TicketSaveDTO;
import com.example.SpringProject.DTO.TicketUpdateDTO;

import java.util.List;

public interface TicketService {
    String addTicket (TicketSaveDTO ticketSaveDTO);

     List<TicketDTO> getAllTicket();

    String updateTicket(TicketUpdateDTO ticketUpdateDTO);



    boolean deleteTicket(int id);
}





