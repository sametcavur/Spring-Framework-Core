package com.project.eventPublisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.project.event.Event;
import com.project.model.User;

@Component
public class EventPublisher {

	@Autowired
	private ApplicationEventPublisher applicationEventPublisher;
	
	public void userRegisterSendMail() {
		String title = "Kayýt Onay Mesajý";
		String content = "Üyeliðinizi onaylamak için linke týklayýnýz.!!";
		User user = new User("smtcvr@gmail.com", "Samet", "Çavur");
		Event event = new Event(user, title, content);
		applicationEventPublisher.publishEvent(event);
	}


}
