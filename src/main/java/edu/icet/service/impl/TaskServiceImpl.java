package edu.icet.service.impl;

import edu.icet.dto.Task;
import edu.icet.entity.TaskEntity;
import edu.icet.repository.TaskRepository;
import edu.icet.repository.UserRepository;
import edu.icet.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService {

    final TaskRepository repository;
    final ModelMapper mapper;
    final UserRepository userRepository;
    @Override
    public void addTask(Task task) {
        TaskEntity taskEntity = new TaskEntity();
        taskEntity.setTitle(task.getTitle());
        taskEntity.setDescription(task.getDescription());
        taskEntity.setCreatedBy(task.getCreatedBy());
        taskEntity.setCreatedDate(task.getCreatedDate());
        taskEntity.setDueDate(task.getDueDate());
        taskEntity.setUpdatedBy(task.getUpdatedBy());
        taskEntity.setUpdatedDate(task.getUpdatedDate());
        taskEntity.setStatus(task.getStatus());
        taskEntity.setUserEntity(userRepository.getById(task.getAssignerId()));
        repository.save(taskEntity);
    }
}
