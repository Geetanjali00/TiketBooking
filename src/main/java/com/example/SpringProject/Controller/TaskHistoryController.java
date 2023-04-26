package com.example.SpringProject.Controller;

import com.example.SpringProject.Entity.Task;
import com.example.SpringProject.Entity.TaskHistory;
import com.example.SpringProject.Service.TaskHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("api/v1/task-history")
public class TaskHistoryController {

    @Autowired
    private TaskHistoryService taskHistoryService;

    @GetMapping("/getAllTaskHistory")
    public List<TaskHistory> getAllTaskHistory() {
        return taskHistoryService.getAllTaskHistory();
    }

    @GetMapping("/getAllTaskHistory/{id}")
    public List<TaskHistory>getUsersHistoryTask(@PathVariable int id)
    {
        System.out.println("Entered");
        return taskHistoryService.getUsersHistoryTask(id);
    }


    @PostMapping("/saveHistory")
    public TaskHistory saveTaskHistory(@RequestBody Task taskHistory){
        System.out.println(taskHistory.getUserId()+"------------------------->");
        return taskHistoryService.saveTaskHistory(taskHistory);
    }

}
