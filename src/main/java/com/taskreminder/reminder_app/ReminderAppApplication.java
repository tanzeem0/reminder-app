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
	private final ReminderService reminderServiceInApp;

	private final ReminderService reminderServiceInApp2;

	private final ReminderService reminderServiceEmail1;

	private final ReminderService reminderServiceEmail2;

	// Constructor Injection
	public ReminderAppApplication(@Qualifier("inAppReminderService")ReminderService reminderService,
								  @Qualifier("inAppReminderService")ReminderService reminderService2,
								  @Qualifier("emailReminderService") ReminderService reminderServiceEmail,
								  @Qualifier("emailReminderService") ReminderService reminderServiceEmail2
								  ) {
        this.reminderServiceInApp = reminderService;
        this.reminderServiceInApp2 = reminderService2;
        this.reminderServiceEmail1 = reminderServiceEmail;
        this.reminderServiceEmail2 = reminderServiceEmail2;
    }

    public static void main(String[] args) {
		SpringApplication.run(ReminderAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Reminder Application Running!!!");
//		reminderService.sendReminder("Hi Belal what is the update with the POC!");
//		System.out.println("Example of prototype beans where inAppReminderService are two different beans compared with unique hashcode: " + (reminderServiceInApp.hashCode() == reminderServiceInApp2.hashCode()));
//		System.out.println("Example of singleton beans where EmailReminderService are two same beans compared with unique hashcode: " + (reminderServiceEmail1.hashCode() == reminderServiceEmail2.hashCode()));
	}
}
