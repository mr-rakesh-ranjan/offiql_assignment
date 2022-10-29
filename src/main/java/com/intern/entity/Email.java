package com.intern.entity;

import javax.persistence.*;

@Entity
@Table
public class Email {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  long messageId;
    private String emailFrom;
    private String emailTo;
    private String emailSubject;
    private String emailBody;

    public Email() {
        super();
    }

    public Email(long messageId, String emailFrom, String emailTo, String emailSubject, String emailBody) {
        this.messageId = messageId;
        this.emailFrom = emailFrom;
        this.emailTo = emailTo;
        this.emailSubject = emailSubject;
        this.emailBody = emailBody;
    }

    public long getMessageId() {
        return messageId;
    }

    public void setMessageId(long messageId) {
        this.messageId = messageId;
    }

    public String getEmailFrom() {
        return emailFrom;
    }

    public void setEmailFrom(String emailFrom) {
        this.emailFrom = emailFrom;
    }

    public String getEmailTo() {
        return emailTo;
    }

    public void setEmailTo(String emailTo) {
        this.emailTo = emailTo;
    }

    public String getEmailSubject() {
        return emailSubject;
    }

    public void setEmailSubject(String emailSubject) {
        this.emailSubject = emailSubject;
    }

    public String getEmailBody() {
        return emailBody;
    }

    public void setEmailBody(String emailBody) {
        this.emailBody = emailBody;
    }

    @Override
    public String toString() {
        return """
Email{
    messageId=$messageId, 
    emailFrom='$emailFrom', 
    emailTo='$emailTo', 
    emailSubject='$emailSubject', 
    emailBody='$emailBody'
}""";
    }
}