package com.project.eventHandling;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.project.event.Event;
import com.project.model.User;

@Component
public class EventListener implements ApplicationListener<Event>{

	public void onApplicationEvent(Event event) {
		System.out.print("Mail Ba�l��� = ");
		System.out.println(event.getTitle());
		System.out.print("Mail A��klama = ");
		System.out.println(event.getContent());
		User user = event.getUser();
		System.out.println("Mail G�nderilecek User Bilgileri:");
		System.out.println(user);
		
	}

}
