package com.project.contextStartStop;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

public class ContextRefresh implements ApplicationListener<ContextRefreshedEvent>{
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		System.out.println("-----Context Refreshed-----");
	}
}
