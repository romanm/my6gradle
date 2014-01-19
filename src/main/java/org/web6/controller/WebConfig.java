package org.web5.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
public class WebConfig {

	public static void main(String[] args) {
		SpringApplication.run(WebConfig.class, args);
	}

}
