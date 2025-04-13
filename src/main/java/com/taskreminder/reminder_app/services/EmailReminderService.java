package com.taskreminder.reminder_app.services;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Lazy
@Service
public class EmailReminderService implements ReminderService{
    public EmailReminderService() {
        System.out.println("Creation of Email Reminder Service bean lazy loaded with constructor!!!");
    }

    @Override
    public void sendReminder(String message) {
        System.out.println("Sending Email: " + message);
    }
    @PostConstruct
    public void runAfterCreationOfEmailReminderService(){
        System.out.println("Initialising EmailReminderService...");
    }
    @PreDestroy
    public void runBeforeDestroyingOfEmailReminderService(){
        System.out.println("Cleaning up EmailReminderService...");
    }
}
