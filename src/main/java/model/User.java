package model;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@Setter
public class User {
  private Long userId;

  private User(Long userId) {
    this.userId = userId;
  }
}
