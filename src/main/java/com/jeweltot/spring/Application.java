package com.jeweltot.spring;

import com.jeweltot.spring.repository.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Application
{
	private static final Logger logger = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args)
	{
		SpringApplication.run(Application.class, args);
	}

	@RequestMapping("/")
	public String index()
	{
		return "springboot actuator";
	}

	@Bean
	CommandLineRunner findAll(PersonRepository repository)
	{
		return args -> {
			logger.info("DB에서 조회한 PERSON : ");
			repository.findAll().forEach(person -> logger.info(person.toString()));
		};
	}
}
