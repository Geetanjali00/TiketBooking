package com.example.SpringProject.Repo;

import com.example.SpringProject.Entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface TaskRepo  extends JpaRepository <Task,Integer> {

//
//    public static List<Task> findByUserId(int id);

    public  List<Task> getByUserId(int userId);
}