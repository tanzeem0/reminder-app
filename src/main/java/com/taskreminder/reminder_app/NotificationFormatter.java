package com.taskreminder.reminder_app;

import org.springframework.stereotype.Component;

import javax.management.NotificationFilter;

@Component
public class NotificationFormatter {
    public NotificationFormatter(){
        System.out.println("Bean created using @Component anotation!");
    }
}
