package edu.ayarayarovich.task3;

import java.util.ArrayList;
import java.util.Objects;
import java.util.function.Predicate;

public class CountriesManager {

    private final ArrayList<Country> countries;

    public CountriesManager() {
        this.countries = new ArrayList<>();
    }

    public void add(Country country) {
        this.countries.add(country);
    }

    public Country findFirstByName(String name) {
        return findByPredicate(country -> Objects.equals(country.getName(), name));
    }

    public Country findFirstByLanguageCode(String languageCode) {
        return findByPredicate(country -> Objects.equals(country.getLanguageCode(), languageCode));
    }

    public Country findFirstByArea(int area) {
        return findByPredicate(country -> country.getArea() == area);
    }

    public Country findFirstByPopulation(int population) {
        return findByPredicate(country -> country.getPopulation() == population);
    }

    public void print() {
        for (Country country : this.countries)
            System.out.println(country);
    }

    public void remove(Country country) {
        this.countries.remove(country);
    }

    public void removeIf(Predicate<? super Country> predicate) {
        this.countries.remove(findByPredicate(predicate));
    }

    private Country findByPredicate(Predicate<? super Country> predicate) {
        return this.countries.stream()
                .filter(predicate)
                .findFirst()
                .orElse(null);
    }

}
