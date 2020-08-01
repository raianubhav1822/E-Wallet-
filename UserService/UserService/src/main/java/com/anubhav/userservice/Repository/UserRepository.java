package com.anubhav.userservice.Repository;

import com.anubhav.userservice.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}

