package com.taskreminder.reminder_app.services;

import org.springframework.stereotype.Service;

@Service
public class SmsReminderService implements ReminderService{
    @Override
    public void sendReminder(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
