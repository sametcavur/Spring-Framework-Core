package test;

import java.util.Locale;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import AppConfig.AppConfig;

public class main {
	
	public static void main(String[] args) {
		
		
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Locale TR = new Locale("tr", "TR");
		
		String messageEnglish = (String) context.getMessage("failure.login.error", args,Locale.US);
		System.out.println(messageEnglish);
		
		String messageTurkish = (String) context.getMessage("failure.login.error", args,TR);
		System.out.println(messageTurkish);
		
		String messageFrench = (String) context.getMessage("failure.login.error", args,Locale.FRANCE);
		System.out.println(messageFrench);
		
		String messageGerman = (String) context.getMessage("failure.login.error", args,Locale.GERMANY);
		System.out.println(messageGerman);
		
		
		
		
		context.close();
	}

}
