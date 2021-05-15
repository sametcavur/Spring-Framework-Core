package com.project.contextStartStop;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class ContextStart implements ApplicationListener<ContextStartedEvent>{
	@Override
	public void onApplicationEvent(ContextStartedEvent event) {
		System.out.println("-----Context Started-----");
	}
}

