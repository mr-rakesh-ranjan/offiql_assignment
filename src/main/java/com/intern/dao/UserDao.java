package com.intern.dao;

import com.intern.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserDao extends JpaRepository<User, Long> {


    // fetching users by its userId
    @Query("select u from User u where u.userId = :e")
    public User findById(@Param("e") long userId);

}
