package com.taskreminder.reminder_app.config;

import com.taskreminder.reminder_app.MessageProvider;
import com.taskreminder.reminder_app.NotificationFormatter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ReminderConfig {

    @Bean
    public MessageProvider createMessageProvider(){
        return new MessageProvider();
    }
}
