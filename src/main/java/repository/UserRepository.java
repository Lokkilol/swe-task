package repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

import model.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
  Optional<User> getUserByUserId(Long id);
}
