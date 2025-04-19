package edu.icet.controller;

import edu.icet.dto.Task;
import edu.icet.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task")
@RequiredArgsConstructor
public class TaskController {

    final TaskService service;

    @PostMapping("/save")
    public void addTask(@RequestBody Task task){
        service.addTask(task);
    }
}
