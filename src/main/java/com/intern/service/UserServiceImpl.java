package com.intern.service;

import com.intern.dao.UserDao;
import com.intern.entity.User;
//import com.intern.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements  UserService{

    @Autowired
    public UserDao userDao;

    //create new user
    @Override
    public User addUser(User user) {
        userDao.save(user);
        return user;
    }

    // fetch all users as list
    @Override
    public List<User> allUsers() {
        return userDao.findAll();
    }

    // find user by its user id
    @Override
    public User findUserById(long userId) {
        return this.userDao.findById(userId);
    }


}
