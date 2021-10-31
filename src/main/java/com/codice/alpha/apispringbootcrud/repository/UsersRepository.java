package com.codice.alpha.apispringbootcrud.repository;

import com.codice.alpha.apispringbootcrud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<User, Integer> {
    User findByName(String name);
}
