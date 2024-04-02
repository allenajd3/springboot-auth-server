package com.springboot.authserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.authserver.entity.Role;
import com.springboot.authserver.enums.RoleEnum;
import com.springboot.authserver.repository.RoleRepository;

@SpringBootApplication
public class AuthServerApplication /*implements CommandLineRunner*/ {
	/*
	@Autowired
	RoleRepository repository;
	*/
	public static void main(String[] args) {
		SpringApplication.run(AuthServerApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		Role adminRole = Role.builder().role(RoleEnum.ROLE_ADMIN).build();
//		Role userRole = Role.builder().role(RoleEnum.ROLE_USER).build();
//		repository.save(adminRole);
//		repository.save(userRole);
//	}
}
