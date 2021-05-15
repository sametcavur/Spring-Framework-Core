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
		System.out.println("Mail G�nderilecek Hesap Bilgileri:");
		System.out.println(user);
		System.out.println("Mail g�nderilecek mail ba�l��� :" + UserSendMailEvent.getTitle());
		System.out.println("Mailin i�eri�i :" + UserSendMailEvent.getContent());
	
	}

}
