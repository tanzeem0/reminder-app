package com.taskreminder.reminder_app.services;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(value = "prototype")
public class InAppReminderService implements ReminderService{
    public InAppReminderService() {
        System.out.println("Creation of InApp bean which is not lazy!!!");
    }

    @Override
    public void sendReminder(String message) {
        System.out.println("Sending InApp Notification: " + message);
    }
}
