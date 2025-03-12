package org.rituraj.linked_list.task_scheduler_system;


import java.time.LocalDate;

public class Task {
    private int id;
    private String name;
    private int priority;
    private LocalDate dueDate;

    public Task(int id, int priority, String name, LocalDate dueDate) {
        this.id = id;
        this.priority = priority;
        this.name = name;
        this.dueDate = dueDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", priority=" + priority +
                ", dueDate=" + dueDate +
                '}';
    }
}
