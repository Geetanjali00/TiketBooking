package com.example.SpringProject.Service;

import com.example.SpringProject.DTO.TicketDTO;
import com.example.SpringProject.DTO.TicketSaveDTO;
import com.example.SpringProject.DTO.TicketUpdateDTO;
import com.example.SpringProject.Entity.Ticket;
import com.example.SpringProject.Repo.TicketRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class TicketServiceIMPL  implements TicketService {

 @Autowired
 private TicketRepo ticketRepo;


 @Override
 public String addTicket(TicketSaveDTO ticketSaveDTO) {

  Ticket ticket = new Ticket(
          ticketSaveDTO.getTicketid(),
          ticketSaveDTO.getpassengername(),
          ticketSaveDTO.getpassengersource(),
          ticketSaveDTO.getpassengerdest(),
          ticketSaveDTO.getMobile()
  );
  ticketRepo.save(ticket);
  return ticket.getpassengername();

 }

 @Override
 public List<TicketDTO> getAllTicket() {

  List<Ticket> getTickets = ticketRepo.findAll();
  List<TicketDTO> ticketDTOList = new ArrayList<>();

  for (Ticket t : getTickets) {
   TicketDTO ticketDTO = new TicketDTO(
           t.getTicketid(),
           t.getpassengername(),
           t.getpassengersource(),
           t.getpassengerdest(),
           t.getMobile()
   );
   ticketDTOList.add(ticketDTO);
  }


  return ticketDTOList;
 }

 @Override
 public String updateTicket(TicketUpdateDTO ticketUpdateDTO) {

  if (ticketRepo.existsById(ticketUpdateDTO.getTicketid())) {
   Ticket ticket = ticketRepo.getById(ticketUpdateDTO.getTicketid());
   // ticket.setTicketid(ticketUpdateDTO.getTicketid());
   ticket.setpassengername(ticketUpdateDTO.getpassengername());
   ticket.setpassengersource(ticketUpdateDTO.getpassengersource());
   ticket.setpassengerdest(ticketUpdateDTO.getpassengerdest());
   ticket.setMobile(ticketUpdateDTO.getMobile());

   ticketRepo.save(ticket);
  } else {
   System.out.println("Ticket Not Found");
  }


  return null;
 }



// @Override
// public boolean deleteTicket(int id) {
//  return false;
// }

 @Override
 public boolean deleteTicket(int id) {
  if (ticketRepo.existsById(id)){
   ticketRepo.deleteById(id);

  }
  else{
   System.out.println("Ticket NOT Found wdlt");
  }


  return true;
 }



}