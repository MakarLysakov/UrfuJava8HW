package ru.lysakov.hw8.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.lysakov.hw8.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

}
