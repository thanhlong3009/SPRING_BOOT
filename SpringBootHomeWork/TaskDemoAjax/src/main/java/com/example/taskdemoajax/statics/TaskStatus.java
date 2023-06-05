package com.example.taskdemoajax.statics;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TaskStatus {

    TODO("TODO", "To Do"),
    IN_PROGRESS("IN_PROGRESS","In progress"),
    REVIEWING("REVIEWING","Reviewing"),
    COMPLETED("COMPLETED","Completed");

    public String code;
    public String name;

}