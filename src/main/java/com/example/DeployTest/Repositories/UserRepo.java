package com.example.DeployTest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.DeployTest.Models.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long>{
	
}
