package com.example.SpringProject.Controller;

import com.example.SpringProject.DTO.TicketDTO;
import com.example.SpringProject.DTO.TicketSaveDTO;
import com.example.SpringProject.DTO.TicketUpdateDTO;
import com.example.SpringProject.Service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/ticket")





public class TicketController {

    @Autowired
    private TicketService ticketService;
    @PostMapping(path="/save")
    public String SaveTicket(@RequestBody TicketSaveDTO ticketSaveDTO){
        String id = ticketService.addTicket(ticketSaveDTO);
        return id;
    }

    @GetMapping(path="getAllTicket")
    public List<TicketDTO> getAllTicket()
    {
        List<TicketDTO>allTickets = ticketService.getAllTicket();
        return allTickets;
    }


    @PutMapping (path="/update")
    public String updateTicket(@RequestBody TicketUpdateDTO ticketUpdateDTO )
    {
        String id = ticketService.updateTicket(ticketUpdateDTO  );
        return id;
    }
    @DeleteMapping  (path="/delete/{id}")
    public String deleteTicket( @PathVariable  (value="id")int id)
    {
        boolean deleteTicket = ticketService.deleteTicket(id);
        return "deleted";
    }





}
