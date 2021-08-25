package com.github.alexgcosta.citiesApi.countries.respository;

import com.github.alexgcosta.citiesApi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country,Long> {
}
