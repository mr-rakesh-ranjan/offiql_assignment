package com.intern.service;

import com.intern.entity.Email;

public interface EmailService {
    // create a new email
    public Email addEmail(Email email);

    //count email send by user
    public  long countEmail(long userId);
}
