package com.example.demo_ajax.scheduler;

import com.example.demo_ajax.entity.Task;
import com.example.demo_ajax.repository.TaskRepository;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.val;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.time.LocalDateTime;
import java.util.List;

@Component
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class TaskOverdueMarker {

    TaskRepository taskRepository;

    @Scheduled(fixedRate = 300000) //  5 phút
    public void taskOverdueMarker() {
        List<Task> tasks = taskRepository.getAll();
//        List<Task> tasks = taskRepository.findAll();
        if (!CollectionUtils.isEmpty(tasks)) {
            return;
        }

        val now = LocalDateTime.now();
        tasks.forEach(t -> t.setOverdue(t.getExpectedEndTime().isBefore(now)));
    }

}
