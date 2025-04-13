package com.taskreminder.reminder_app;

import com.taskreminder.reminder_app.services.ReminderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReminderAppApplication implements CommandLineRunner {

	// Field Injection
//	@Autowired
//	@Qualifier("emailReminderService")
	private final ReminderService reminderService;

	// Constructor Injection
	public ReminderAppApplication(@Qualifier("inAppReminderService")ReminderService reminderService) {
        this.reminderService = reminderService;
    }

    public static void main(String[] args) {
		SpringApplication.run(ReminderAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Reminder Application Running!!!");
		System.out.println(reminderService.hashCode());
		reminderService.sendReminder("Hi Belal what is the update with the POC!");
	}
}
