package com.example.SpringProject.Service;

import com.example.SpringProject.Entity.User;
import com.example.SpringProject.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public List<User> getUsers() {
        return userRepo.findAll();
    }

    public User saveUser(User user) {
        //System.out.println(user.getUser)
        return userRepo.save(user);
    }



}


