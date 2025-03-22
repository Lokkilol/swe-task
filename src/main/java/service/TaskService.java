package service;

import model.Task;

public interface TaskService {
  /**
   * Used to create task that will be then get tied to the user.
   * @return Task
   */
  Task createTask();
}
