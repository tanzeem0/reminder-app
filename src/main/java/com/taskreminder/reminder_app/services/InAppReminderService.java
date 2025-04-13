package com.taskreminder.reminder_app.services;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
public class InAppReminderService implements ReminderService{

    @Override
    public void sendReminder(String message) {
        System.out.println("Sending InApp Notification: " + message);
    }
}
