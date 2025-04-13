package com.taskreminder.reminder_app;

public class MessageProvider {

    public MessageProvider() {
        System.out.println("Bean created for message Provider using config class");
    }

    public String provideDefaultMessage(){
        return "Hi Belal what is the update with the POC!";
    }
}
