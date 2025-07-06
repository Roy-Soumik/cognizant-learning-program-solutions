package com.cognizant.orm_learn.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.repository.CountryRepository;

import com.cognizant.orm_learn.service.exception.CountryNotFoundException;


@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    @Transactional
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    @Transactional
    public Country findCountryByCode(String code) throws CountryNotFoundException {
        Optional<Country> country = countryRepository.findById(code);
        if (!country.isPresent()) {
            throw new CountryNotFoundException("Country not found: " + code);
        }
        return country.get();
    }

    @Transactional
    public void addCountry(Country country) {
        countryRepository.save(country);
    }

    @Transactional
    public void updateCountry(String code, String newName) throws CountryNotFoundException {
        Optional<Country> opt = countryRepository.findById(code);
        if (!opt.isPresent()) {
            throw new CountryNotFoundException("Country not found: " + code);
        }
        Country country = opt.get();
        country.setName(newName);
        countryRepository.save(country);
    }

    @Transactional
    public void deleteCountry(String code) {
        countryRepository.deleteById(code);
    }

    // exercise 2

    @Transactional
    public List<Country> findCountriesByNameContains(String text) {
        return countryRepository.findByNameContainingIgnoreCase(text);
    }

    @Transactional
    public List<Country> findCountriesByNameContainsSorted(String text) {
        return countryRepository.findByNameContainingIgnoreCaseOrderByNameAsc(text);
    }

    @Transactional
    public List<Country> findCountriesStartingWith(String prefix) {
        return countryRepository.findByNameStartingWithIgnoreCase(prefix);
    }


}
