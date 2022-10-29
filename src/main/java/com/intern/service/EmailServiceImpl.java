package com.intern.service;

import com.intern.dao.EmailDao;
import com.intern.entity.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {

    @Autowired
    private EmailDao emailDao;


    @Override
    public Email addEmail(Email email) {
        emailDao.save(email);
        return email;
    }
}
