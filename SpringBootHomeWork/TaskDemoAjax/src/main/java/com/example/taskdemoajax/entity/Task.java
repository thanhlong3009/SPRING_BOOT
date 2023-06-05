package com.example.taskdemoajax.entity;

import com.example.taskdemoajax.statics.TaskStatus;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import java.time.LocalDateTime;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Task {

    int id;

    String name;

    String description;

    TaskStatus status;

    LocalDateTime createdDateTime;

    LocalDateTime expectedEndTime;

    Boolean overdue;

}
