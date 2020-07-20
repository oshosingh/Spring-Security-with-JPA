package com.example.hcc.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hcc.dao.UserData;

public interface MyUserRepository extends JpaRepository<UserData, Integer>{
	
	Optional<UserData> findByUserName(String userName);
	
}
