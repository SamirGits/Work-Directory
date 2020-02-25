package com.cts.training.casestudy.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.training.casestudy.userservice.entity.User;



@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
