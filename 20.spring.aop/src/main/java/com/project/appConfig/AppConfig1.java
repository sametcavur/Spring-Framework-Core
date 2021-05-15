package com.project.appConfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
	DatabaseConfig.class,BeanConfig.class
})
public class AppConfig1 {
}
