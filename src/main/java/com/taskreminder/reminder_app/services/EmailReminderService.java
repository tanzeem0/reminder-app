package com.taskreminder.reminder_app.services;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
@Lazy
public class EmailReminderService implements ReminderService{
    public EmailReminderService() {
        System.out.println("Creation of Email Reminder Service bean lazy loaded!!!");
    }

    @Override
    public void sendReminder(String message) {
        System.out.println("Sending Email: " + message);
    }
}
