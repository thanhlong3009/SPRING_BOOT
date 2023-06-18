package com.example.demo_ajax.service;

import com.example.demo_ajax.entity.Task;
import com.example.demo_ajax.model.request.TaskRequest;
import com.example.demo_ajax.model.response.TaskDetailResponse;
import com.example.demo_ajax.model.response.TaskResponse;
import com.example.demo_ajax.model.response.TaskStatusResponse;
import com.example.demo_ajax.repository.TaskRepository;
import com.example.demo_ajax.statics.TaskStatus;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class TaskService {

    ObjectMapper objectMapper;

    TaskRepository taskRepository;

    public List<TaskResponse> getAll() {
        List<Task> tasks = taskRepository.getAll();
//        List<Task> tasks = taskRepository.findAll();
        List<TaskDetailResponse> tempData = tasks.stream().map(t -> objectMapper.convertValue(t, TaskDetailResponse.class)).collect(Collectors.toList());

        List<TaskStatus> taskStatuses = Arrays.asList(TaskStatus.values());
        return taskStatuses.stream().map(status -> {
            List<TaskDetailResponse> taskDetailResponses = tempData.stream().filter(t -> t.getStatus().equals(status)).collect(Collectors.toList());
            return new TaskResponse(status, taskDetailResponses);
        }).collect(Collectors.toList());
    }

    public List<TaskStatusResponse> getTaskStatus() {
        return List.of(
                TaskStatusResponse.builder().code(TaskStatus.TODO.getCode()).name(TaskStatus.TODO.getName()).build(),
                TaskStatusResponse.builder().code(TaskStatus.IN_PROGRESS.getCode()).name(TaskStatus.IN_PROGRESS.getName()).build(),
                TaskStatusResponse.builder().code(TaskStatus.REVIEWING.getCode()).name(TaskStatus.REVIEWING.getName()).build(),
                TaskStatusResponse.builder().code(TaskStatus.COMPLETED.getCode()).name(TaskStatus.COMPLETED.getName()).build()
        );
    }

    public void saveTask(@Valid TaskRequest request) {
        Task task = objectMapper.convertValue(request, Task.class);
        if (!ObjectUtils.isEmpty(request.getId())) {
            taskRepository.update(task);
//            taskRepository.save(task);
            return;
        }

        LocalDateTime now = LocalDateTime.now();
        task.setCreatedDateTime(now);
        task.setOverdue(task.getExpectedEndTime().isBefore(now));
        taskRepository.add(task);
//        taskRepository.save(task);
    }

    public TaskDetailResponse getDetail(Integer id) {
        Task task = taskRepository.getOne(id);
//        Optional<Task> task = taskRepository.findById(id);
        return objectMapper.convertValue(task, TaskDetailResponse.class);
    }

    public void delete(Integer id) {
        taskRepository.delete(id);
//        taskRepository.deleteById(id);
    }
}
