package com.example.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.security.entity.MyUser;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = MyUser.class)
public class LoginAunthenticationApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginAunthenticationApplication.class, args);
	}

}
