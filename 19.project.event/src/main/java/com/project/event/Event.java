package com.project.event;

import org.springframework.context.ApplicationEvent;

import com.project.model.User;

public class Event extends ApplicationEvent{
	private static final long serialVersionUID = 8044322708652585918L;
	private String title;
	private String content;
	private User user;
	public Event(User user,String title, String content) {
		// 2 tane user koymam�z�n sebebi super i�indeki user kal�tt���m�z classa gitti.Ve user bilgilerini yazd�ramay�z.
		//Di�er user� da koyarak to string metodunda da �al��mas�n� sa�lad�k.
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
		return "Event [title=" + title + ", content=" + content + ", user=" + user + "]";
	}
}
