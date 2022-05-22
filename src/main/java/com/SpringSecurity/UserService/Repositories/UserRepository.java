package com.SpringSecurity.UserService.Repositories;

import com.SpringSecurity.UserService.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    User findByUsername(String username);
}
