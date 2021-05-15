package com.project.event;

import org.springframework.context.ApplicationEvent;

import com.project.user.User;

public class UserSendMailEvent extends ApplicationEvent{
	private static final long serialVersionUID = 1L;

	private String title;
	private String content;
	private User user;
	public UserSendMailEvent(User user,String title,String content) {
		super(user);
		this.user = user;
		this.title = title;
		this.content = content;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "UserSendMailEvent [title=" + title + ", content=" + content + ", user=" + user + "]";
	}

	
}
