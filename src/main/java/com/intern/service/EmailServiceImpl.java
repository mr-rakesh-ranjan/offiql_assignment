package com.intern.service;

import com.intern.dao.EmailDao;
import com.intern.dao.UserDao;
import com.intern.entity.Email;
import com.intern.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {

    @Autowired
    private EmailDao emailDao;

    @Autowired
    private UserDao userDao;


    //create a new mail in db
    @Override
    public Email addEmail(Email email) {
        emailDao.save(email);
        return email;
    }

    @Override
    public long countEmail(long userId) {
        User user = this.userDao.findById(userId);
        String userEmail = user.getEmailAddress();
        System.out.println("user email is : "+userEmail);
        long res = this.emailDao.count();
        System.out.println("res= "+ res);
        return res;
    }
}
