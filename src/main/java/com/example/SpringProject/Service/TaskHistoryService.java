package com.example.SpringProject.Service;

import com.example.SpringProject.Entity.Task;
import com.example.SpringProject.Entity.TaskHistory;
import com.example.SpringProject.Repo.TaskHistoryRepo;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskHistoryService {

    @Autowired
    private TaskHistoryRepo taskHistoryRepo;


    public List<TaskHistory> getAllTaskHistory() {
        return taskHistoryRepo.findAll();
    }

    public TaskHistory saveTaskHistory(Task taskHistory) {
        TaskHistory item = new TaskHistory();
        item.setTaskDetail(taskHistory.getTaskdetail());
        item.setTaskName(taskHistory.getTaskname());
        item.setTaskId(taskHistory.getTaskid());
        item.setUserId(taskHistory.getUserId());

        return taskHistoryRepo.save(item);
    }

    public List<TaskHistory> getUsersHistoryTask(int id) {
        return taskHistoryRepo.getByUserId(id);
    }
}
