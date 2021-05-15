package AppConfig;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class AppConfig {
	
	@Bean
	public MessageSource messageSource() {
		ResourceBundleMessageSource message = new ResourceBundleMessageSource();
		message.setBasename("messages");
		message.setDefaultEncoding("UTF-8");
		return message;
	}
}
