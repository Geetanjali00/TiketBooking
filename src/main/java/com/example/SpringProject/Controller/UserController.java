package com.example.SpringProject.Controller;

import com.example.SpringProject.Entity.User;
import com.example.SpringProject.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin("*")
//@RequestMapping("api/v1/USER")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getUsers")
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @PostMapping("/saveUser")
    public User addUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

}
