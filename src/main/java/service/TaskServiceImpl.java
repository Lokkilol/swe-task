package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Task;
import repository.TaskRepository;

@Service
public class TaskServiceImpl implements TaskService {

  TaskRepository taskRepo;

  @Autowired
  public TaskServiceImpl(TaskRepository taskRepo) {
    this.taskRepo = taskRepo;
  }

  @Override
  public Task createTask() {
    return null;
  }
}
