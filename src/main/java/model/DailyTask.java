package model;

public class DailyTask extends Task {
  DailyTask(Long id, String userId, String title, String description, String estimatedDuration) {
    super(id, userId, title, description, estimatedDuration);
  }
}
