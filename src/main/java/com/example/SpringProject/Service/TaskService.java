package com.example.SpringProject.Service;

import com.example.SpringProject.Entity.Task;
import com.example.SpringProject.Entity.TaskHistory;
import com.example.SpringProject.Repo.TaskRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepo repo;
    public Task addTask(Task task) {

        return repo.save(task);
    }
    public List<Task> getAllTasks() {
        return repo.findAll();
    }
    public Task updateTask(Task task, int taskId) {
        task.setTaskid(taskId);

        return repo.save(task);
    }

    public void deleteTask(int id) {
        repo.deleteById(id);
    }
    public TaskHistory deleteTask(int id, String deletedBy) {
        Task task = repo.getById(id);

        // Create a TaskHistory object
        TaskHistory taskHistory = new TaskHistory();
        taskHistory.setTaskName(task.getTaskname());
        taskHistory.setTaskDetail(task.getTaskdetail());


        // Delete the task from the tasks table
        repo.deleteById(id);
        return taskHistory;

        // Create a TaskHistory object
    }

    public Task addPriority(int taskId, boolean priority) {
        Task task = repo.findById(taskId).orElse(null);
        if (task != null) {
            task.setPriority(priority);
            return repo.save(task);
        }
        return null;

    }

    public  List<Task> getByUserId(int userId) {
        return repo.getByUserId(userId);
    }


    public List<Task> getAllUserTasks(int id) {
        return repo.getByUserId(id);
    }
}
