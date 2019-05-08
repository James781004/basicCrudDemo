package com.James.crudDemo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.James.crudDemo.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
