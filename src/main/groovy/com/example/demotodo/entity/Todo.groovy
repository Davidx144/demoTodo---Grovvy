package com.example.demotodo.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name="todo")
class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id
    @Column
    String task
    @Column
    Boolean isDone

    Todo() {

    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", task='" + task + '\'' +
                ", isDone=" + isDone +
                '}';
    }

    Todo(int id, String task, Boolean isDone) {
        this.id = id
        this.task = task
        this.isDone = isDone
    }

    int getId() {
        return id
    }

    void setId(int id) {
        this.id = id
    }

    String getTask() {
        return task
    }

    void setTask(String task) {
        this.task = task
    }

    Boolean getIsDone() {
        return isDone
    }

    void setIsDone(Boolean isDone) {
        this.isDone = isDone
    }
}
