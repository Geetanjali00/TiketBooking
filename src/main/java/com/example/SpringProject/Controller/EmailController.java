package com.example.SpringProject.Controller;

import com.example.SpringProject.Entity.Email;
import com.example.SpringProject.Service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/emails")
@CrossOrigin("*")
public class EmailController {

    @Autowired
    private EmailService emailService;
    @PostMapping("/send")
    public void sendEmail(@RequestBody Email email) {
       emailService.sendEmail(email);
    }

}

