package com.example.SpringProject.Repo;

import com.example.SpringProject.Entity.TaskHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskHistoryRepo extends JpaRepository<TaskHistory, Integer> {
    @Query(value = "SELECT * FROM Task_management1.task_history ORDER BY TASK_ID;",nativeQuery = true)
    List<TaskHistory > getAllTaskHistory();

   public List<TaskHistory> getByUserId(int id);
}
