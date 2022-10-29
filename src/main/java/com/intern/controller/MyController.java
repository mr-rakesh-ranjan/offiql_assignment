package com.intern.controller;

import com.intern.entity.Email;
import com.intern.entity.User;
import com.intern.service.EmailServiceImpl;
import com.intern.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    //service for users
    @Autowired
    private UserServiceImpl userService;


    //service for email
    @Autowired
    private EmailServiceImpl emailService;

    @GetMapping("/home")
    public String home(){
        return "this is home page ";
    }

//    creating a new user
    @PostMapping("/user")
    public User addUser(@RequestBody User user){
        this.userService.addUser(user);
        return user;
    }

    // for fetching all users as list
    @GetMapping("/users")
    public List<User> allUsers(){
        return this.userService.allUsers();
    }

    // get user by ID
    @GetMapping("/user/{userId}")
    public User getUser(@PathVariable("userId") String userId) {
        return this.userService.findUserById(Long.parseLong(userId));
    }

    //creat an email in db
    @PostMapping("/email")
    public Email addEmail(@RequestBody Email email){
        this.emailService.addEmail(email);
        return email;
    }

    @GetMapping("email/count/user={userId}")
    public long getEmail(@PathVariable("userId") String userId){
        return this.emailService.countEmail(Long.parseLong(userId));
    }
}
