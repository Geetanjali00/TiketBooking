package com.example.SpringProject.Controller;

import com.example.SpringProject.Entity.Task;
import com.example.SpringProject.Entity.TaskHistory;
import com.example.SpringProject.Service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("api/v1/task")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @PostMapping("/save")
    public Task addTask(@RequestBody Task task) {
        System.out.println(task.getUserId());
        return taskService.addTask(task);
    }
    @GetMapping(path="getAllTask")
    public List<Task> getTaskMain(){
        return taskService.getAllTasks();
    }

    // for dashboard
    @GetMapping(path="getAllTask/{id}")
    public List<Task> getTask(@PathVariable int id){
        return taskService.getAllUserTasks(id);
    }

    @PutMapping (path="/update/{taskid}")
    public Task updateTask(@RequestBody Task task,@PathVariable int taskid){
        return taskService.updateTask(task, taskid);
    }
    @DeleteMapping  (path="/delete/{id}")
    public String deleteTask(@PathVariable(value="id") int id){
        TaskHistory savedTaskHistory = taskService.deleteTask(id, "user"); // Pass the user who performed the delete operation

        if (savedTaskHistory != null) {
            return "udwgcoi";
        } else {
            return "ehiughdoiw";
        }
    }
    //PRIORITY
    @PostMapping (path="/priority/{taskid}")
    public Task addPriority(@PathVariable int taskid, @RequestParam boolean priority){
        return taskService.addPriority(taskid, priority);
    }

    //USER

    @GetMapping("/getByUserId/{userId}")
    public  List<Task> getByUserId(@PathVariable int userId){
        return  taskService.getByUserId(userId);
    }




}

