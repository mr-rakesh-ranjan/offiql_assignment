# Reference book for user guide


### Create a new User

url endpoint - http://localhost:9090/user
Method - POST

Request Body-   
{
        "firstName" : "Deepak",
        "lastName" : "Roy",
        "emailAddress" : "depak45@gmail.com",
        "phoneNumber" : "9876543211"
}

Response Body - 
{
    "userId": 2,
    "firstName": "Deepak",
    "lastName": "Roy",
    "emailAddress": "depak45@gmail.com",
    "phoneNumber": "9876543211"
}

### All Users

url endpoint - http://localhost:9090/users
method - GET

Request body - not required


Response Body-  
[
    {
        "userId": 1,
        "firstName": "rakesh",
        "lastName": "Ranjan",
        "emailAddress": "rakesh@gmail.com",
        "phoneNumber": "6203212340"
    },
    {
        "userId": 2,
        "firstName": "Deepak",
        "lastName": "Roy",
        "emailAddress": "depak45@gmail.com",
        "phoneNumber": "9876543211"
    }
]


### Return User by Id

url endpoint - http://localhost:9090/user/1
method - GET

Request Body - not required

Response Body -

{
    "userId": 1,
    "firstName": "rakesh",
    "lastName": "Ranjan",
    "emailAddress": "rakesh@gmail.com",
    "phoneNumber": "6203212340"
}


### Create an email In db

url endpoint - http://localhost:9090/email
method - POST

Request Body -
{
    "emailFrom" : "rakesh@gmail.com",
    "emailTo" : "depak45@gmail.com",
    "emailSubject" : "Two pen",
    "emailBody" : "Hi bro, I have two pen"
}

Response Body -
{
    "messageId": 3,
    "emailFrom": "rakesh@gmail.com",
    "emailTo": "depak45@gmail.com",
    "emailSubject": "Two pen",
    "emailBody": "Hi bro, I have two pen"
}


### Number of email send by a user

url endpoint - http://localhost:9090/email/count?user=1

Request Body - Not required

Response Body - 5
