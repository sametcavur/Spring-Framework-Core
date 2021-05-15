package com.project.publisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.project.event.UserSendMailEvent;
import com.project.user.User;


@Component
public class UserSendMailPublisher {
	
	@Autowired
	private ApplicationEventPublisher applicationEventPublisher;
	
	public void userRegisterMessage() {
		String title = "Kay�t Onay Mesaj�";
		String content = "Kayd�n�z� tamamlamak i�in a�a��daki linke t�klay�n�z." ;
		
		User user = new User("smtcvr@gmail.com","smtPassword","Samet","�avur");
		UserSendMailEvent event = new UserSendMailEvent(user, title, content);
		
		this.applicationEventPublisher.publishEvent(event);
	}

}
