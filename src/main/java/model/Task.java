package model;



// Should be able to use SLF4J @Getter / @Setter
public class Task {
  private Long id;
  private String userId;
  private String title;
  private String description;
  private String estimatedDuration;

  Task(Long id, String userId, String title, String description, String estimatedDuration) {
    this.id = id;
    this.userId = userId;
    this.title = title;
    this.description = description;
    this.estimatedDuration = estimatedDuration;
  }







}
