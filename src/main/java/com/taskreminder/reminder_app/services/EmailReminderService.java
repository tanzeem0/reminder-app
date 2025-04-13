package com.taskreminder.reminder_app.services;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service

public class EmailReminderService implements ReminderService{
    @Override
    public void sendReminder(String message) {
        System.out.println("Sending Email: " + message);
    }
}
