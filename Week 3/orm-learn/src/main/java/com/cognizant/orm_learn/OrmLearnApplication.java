package com.cognizant.orm_learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.service.CountryService;
import org.springframework.context.ApplicationContext;

import com.cognizant.orm_learn.service.exception.CountryNotFoundException;

@SpringBootApplication
public class OrmLearnApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);

	private static CountryService countryService;

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);

		LOGGER.info("Inside main");

		countryService = context.getBean(CountryService.class);
		testGetAllCountries();
		findCountryByCodeTest();
		testAddCountry();
		updateCountryTest();
		deleteCountryTest();

		testFindByNameContaining();
		testFindByNameContainingSorted();
		testFindByNameStartingWith();

	}

	private static void testGetAllCountries() {
		LOGGER.info("Start");
		List<Country> countries = countryService.getAllCountries();
		LOGGER.debug("countries={}", countries);
		LOGGER.info("End");
	}

	private static void findCountryByCodeTest() {
		LOGGER.info("Start");
		try {
			Country country = countryService.findCountryByCode("XX");
			LOGGER.debug("Country: {}", country);
		} catch (CountryNotFoundException e) {
			LOGGER.error("Error: {}", e.getMessage());
		}
		LOGGER.info("End");
	}


	private static void testAddCountry() {
		LOGGER.info("Start testAddCountry");
		Country newCountry = new Country();
		newCountry.setCode("ZZ");
		newCountry.setName("Zootopia");
		countryService.addCountry(newCountry);

		try {
			Country fetched = countryService.findCountryByCode("ZZ");
			LOGGER.debug("Fetched after add: {}", fetched);
		} catch (CountryNotFoundException e) {
			LOGGER.error("Country not found after add: {}", e.getMessage());
		}
		LOGGER.info("End");
	}


	private static void updateCountryTest() {
		LOGGER.info("Start testUpdateCountryByCode");
		try {
			countryService.updateCountry("ZZ", "Zootopia Updated");
			Country c = countryService.findCountryByCode("ZZ");
			LOGGER.debug("After update, Country: {}", c);
		} catch (CountryNotFoundException e) {
			LOGGER.error("Could not update country: {}", e.getMessage());
		}
		LOGGER.info("End");
	}

	private static void deleteCountryTest() {
		LOGGER.info("Start");
		countryService.deleteCountry("ZZ");
		LOGGER.info("Deleted Country with code ZZ");
		LOGGER.info("End");
	}

	// exercise 2

	private static void testFindByNameContaining() {
		LOGGER.info("Start - testFindByNameContaining");
		List<Country> countries = countryService.findCountriesByNameContains("ou");
		countries.forEach(c -> LOGGER.debug("{} {}", c.getCode(), c.getName()));
		LOGGER.info("End - testFindByNameContaining");
	}

	private static void testFindByNameContainingSorted() {
		LOGGER.info("Start - testFindByNameContainingSorted");
		List<Country> countries = countryService.findCountriesByNameContainsSorted("ou");
		countries.forEach(c -> LOGGER.debug("{} {}", c.getCode(), c.getName()));
		LOGGER.info("End - testFindByNameContainingSorted");
	}

	private static void testFindByNameStartingWith() {
		LOGGER.info("Start - testFindByNameStartingWith");
		List<Country> countries = countryService.findCountriesStartingWith("Z");
		countries.forEach(c -> LOGGER.debug("{} {}", c.getCode(), c.getName()));
		LOGGER.info("End - testFindByNameStartingWith");
	}


}


