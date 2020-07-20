package com.example.hcc.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.hcc.MyUserDetails;
import com.example.hcc.dao.UserData;
import com.example.hcc.repo.MyUserRepository;

@Service
public class MyUserDetailsSevice implements UserDetailsService {
	
	public static Logger log = LoggerFactory.getLogger(MyUserDetailsSevice.class.getName());
	
	@Autowired
	MyUserRepository repository;

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		
		Optional<UserData> userData = repository.findByUserName(userName);
		
		log.info(userData.toString());
		userData.orElseThrow(()-> new UsernameNotFoundException(userName));
		
		return userData.map(MyUserDetails::new).get();
		
	}

}
