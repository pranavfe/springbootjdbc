package com.pranav.SpringBootJdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringBootJdbcApplication.class, args);
		
		AlienReposit repo=(AlienReposit) 
				context.getBean(AlienReposit.class);
		
		Alien alien=repo.getAlien(3);
		
		System.out.println(alien.toString());
		
		  
		
        
	}
}
