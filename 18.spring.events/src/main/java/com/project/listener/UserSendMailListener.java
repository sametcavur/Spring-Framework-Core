package com.project.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.project.event.UserSendMailEvent;
import com.project.user.User;

@Component
public class UserSendMailListener implements ApplicationListener<UserSendMailEvent> {

	@Override
	public void onApplicationEvent(UserSendMailEvent UserSendMailEvent) {
		User user = UserSendMailEvent.getUser();
		System.out.println("Mail Gönderilecek Hesap Bilgileri:");
		System.out.println(user);
		System.out.println("Mail gönderilecek mail baþlýðý :" + UserSendMailEvent.getTitle());
		System.out.println("Mailin içeriði :" + UserSendMailEvent.getContent());
	
	}

}
