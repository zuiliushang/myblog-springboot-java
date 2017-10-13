package com.raindrops.blog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@ServletComponentScan
public class App {
	
	public static Logger logger = LoggerFactory.getLogger(App.class);
	
	public static void main(String[] args) {
		logger.debug("classPath={}",Thread.currentThread().getContextClassLoader ().getResource(""));
		SpringApplication springApplication =new SpringApplication(App.class);
		ConfigurableApplicationContext context = springApplication.run(args);
		context.registerShutdownHook();
	}
}
