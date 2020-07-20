package com.example.hcc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.hcc.repo.MyUserRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = MyUserRepository.class)
public class JpaAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaAuthApplication.class, args);
	}

}
