package edu.ayarayarovich.task3;

import java.util.Comparator;

public class Country {
    String name, languageCode;
    int area, population;

    public Country(String name, String languageCode, int area, int population) {
        this.name = name;
        this.languageCode = languageCode;
        this.area = area;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public static Comparator<Country> CompByName = new Comparator<Country>() {
        @Override
        public int compare(Country o1, Country o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };

    public static Comparator<Country> CompByPopulation = new Comparator<Country>() {
        @Override
        public int compare(Country o1, Country o2) {
            return o1.getPopulation() - o2.getPopulation();
        }
    };

    public static Comparator<Country> CompByArea = new Comparator<Country>() {
        @Override
        public int compare(Country o1, Country o2) {
            return o1.getArea() - o2.getArea();
        }
    };

    public static Comparator<Country> CompByLanguageCode = new Comparator<Country>() {
        @Override
        public int compare(Country o1, Country o2) {
            return o1.getLanguageCode().compareTo(o2.getLanguageCode());
        }
    };

    @Override
    public String toString() {
        return name + " (" +
                "population: " + this.getPopulation() + ", " +
                "area: " + this.getArea() + ", " +
                "language code: " + this.languageCode + ")";
    }
}


