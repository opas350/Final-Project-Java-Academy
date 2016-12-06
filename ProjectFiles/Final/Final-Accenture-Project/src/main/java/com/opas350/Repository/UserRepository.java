package com.opas350.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.opas350.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
