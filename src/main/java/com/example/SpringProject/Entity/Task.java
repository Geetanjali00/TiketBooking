package com.example.SpringProject.Entity;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tasks")
public class Task {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "TASK_SEQUENCE")
    @SequenceGenerator(name = "TASK_SEQUENCE", sequenceName = "TASK_SEQUENCE", allocationSize = 1  )
    @Column(name = "Task_id", length = 50)
    private int taskid;
    @Column(name = "Task_Name", length = 500)
    private String taskname;
    @Column(name = "Task_detail", length = 50)
    private String taskdetail;

    @Column(name = "Priority",columnDefinition = "boolean default false")
    private boolean priority;
    @Column(name="Target_Date")
    private LocalDate targetDate;

    @Column(name="DATE")
    //Date date = new Date(Calendar.getInstance() .getTime().getTime());
    LocalDate date= LocalDate.now();
    private  int userId;

    //Constructor
    public Task(int taskid, String taskname, String taskdetail, boolean priority,  LocalDate targetDate,LocalDate date,int userId) {
        this.taskid = taskid;
        this.taskname = taskname;
        this.taskdetail = taskdetail;
        this.priority = priority;
        this.targetDate = targetDate;
        this.date = date;
        this.userId=userId;

    }


    //defaultcontructor


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Task() {
    }



    //gettersetter
    public int getTaskid() {
        return taskid;
    }

    public void setTaskid(int taskid) {
        this.taskid = taskid;
    }

    public String getTaskname() {
        return taskname;
    }

    public void setTaskname(String taskname) {
        this.taskname = taskname;
    }

    public String getTaskdetail() {
        return taskdetail;
    }

    public void setTaskdetail(String taskdetail) {
        this.taskdetail = taskdetail;
    }

    public boolean isPriority() {
        return priority;
    }

    public void setPriority(boolean priority) {
        this.priority = priority;
    }
    public LocalDate getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(LocalDate targetDate) {
        this.targetDate = targetDate;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
