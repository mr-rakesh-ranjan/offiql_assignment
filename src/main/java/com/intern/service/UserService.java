package com.intern.service;

import com.intern.entity.User;

import java.util.List;

public interface UserService {
    // create a new user
    public User addUser(User user);

    //for list of users
    public List<User> allUsers();


    // get method for user by its user ID
    public User findUserById(long userId);
}
