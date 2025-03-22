package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

import model.User;
import repository.UserRepository;

@Service
public class UserServiceImpl {
  @Autowired
  UserRepository userRepository;

  User getUser(Long id) {
    Optional<User> user = userRepository.getUserByUserId(id);
    return user.orElseThrow(null);

    }
}
