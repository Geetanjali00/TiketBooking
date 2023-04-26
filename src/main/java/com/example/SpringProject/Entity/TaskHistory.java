package com.example.SpringProject.Entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "task_history")
public class TaskHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "HISTORY_SEQUENCE")
    @SequenceGenerator(name = "HISTORY_SEQUENCE", sequenceName = "HISTORY_SEQUENCE", allocationSize = 1  )
    private int taskHistoryId;
    private int TaskId;
    private String taskName;
    private String taskDetail;
    @Column(name="DATE")

    LocalDate date= LocalDate.now();

    int userId;


    public TaskHistory() {
    }

    public TaskHistory(int taskHistoryId, int taskId, String taskName, String taskDetail, LocalDate date,int userId) {
        this.taskHistoryId = taskHistoryId;
        TaskId = taskId;
        this.taskName = taskName;
        this.taskDetail = taskDetail;
        this.date = date;
        this.userId=userId;
    }

    public int getTaskHistoryId() {
        return taskHistoryId;
    }

    public void setTaskHistoryId(int taskHistoryId) {
        this.taskHistoryId = taskHistoryId;
    }

    public int getTaskId() {
        return TaskId;
    }

    public void setTaskId(int taskId) {
        TaskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDetail() {
        return taskDetail;
    }
    public void setTaskDetail(String taskDetail) {
        this.taskDetail = taskDetail;
    }
    public LocalDate getDate() {
            return date;
    }

        public void setDate(LocalDate date) {
            this.date = date;
        }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "TaskHistory{" +
                "taskHistoryId=" + taskHistoryId +
                ", TaskId=" + TaskId +
                ", taskName='" + taskName + '\'' +
                ", taskDetail='" + taskDetail + '\'' +
                ", date=" + date +
                '}';
    }
}