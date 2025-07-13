package com.cognizant.spring_learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringLearnApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

	public static void displayDate() {
		LOGGER.info("START");
		ApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");
		SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);
		try {
			Date date = format.parse("13/07/2025");
			LOGGER.debug("Date: {}", date);
		} catch (Exception e) {
			e.printStackTrace();
		}
		LOGGER.info("END");
	}

	public static void displayCountry() {
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		Country country = (Country) context.getBean("country", Country.class);
		LOGGER.info("Country: {}", country);
	}

	public static void main(String[] args) {
		LOGGER.info("Starting Application");
		SpringApplication.run(SpringLearnApplication.class, args);
		LOGGER.info("Exiting Application");

		displayDate();
		displayCountry();
	}

}
