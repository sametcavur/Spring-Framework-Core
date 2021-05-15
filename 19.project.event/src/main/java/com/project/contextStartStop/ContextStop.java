package com.project.contextStartStop;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

public class ContextStop implements ApplicationListener<ContextStoppedEvent>{
	@Override
	public void onApplicationEvent(ContextStoppedEvent event) {
		System.out.println("-----Context Stopped-----");
	}
}
