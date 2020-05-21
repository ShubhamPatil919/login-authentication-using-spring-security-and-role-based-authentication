package com.example.security.entity;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyUser extends JpaRepository<User, Integer> {

	Optional<User> findByUserName(String userName);

}
