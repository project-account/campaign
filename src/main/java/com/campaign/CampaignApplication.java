package com.campaign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.campaign")
public class CampaignApplication {

	public static void main(String[] args) {
		SpringApplication.run(CampaignApplication.class, args);
	}
}
