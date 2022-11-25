package edu.ayarayarovich.task3;

import edu.ayarayarovich.task1.Prompter;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CommandPrompt commandPrompt = new CommandPrompt(System.in, System.out);

        CountriesManager countriesManager = new CountriesManager();

        String command;
        while (!Objects.equals(command = commandPrompt.getNextCommand(), "quit")) {
            switch (command) {
                case "add" -> {
                    Prompter prompter = new Prompter(System.in, System.out, "Provide new country description");
                    countriesManager.add(new Country(
                        prompter.askForLine("name"),
                        prompter.askForLine("language code"),
                        prompter.askForInt("area"),
                        prompter.askForInt("population")
                    ));
                }
                case "remove" -> {
                    Prompter prompter = new Prompter(System.in, System.out, "Select criteria (name, language code, area, population) by which you want to select a country");
                    String criteria = prompter.askForLine("criteria");
                    switch (criteria) {
                        case "name" -> {
                            String name = prompter.askForLine("name");
                            Country country = countriesManager.findFirstByName(name);
                            countriesManager.remove(country);
                            System.out.println("Deleted " + country.getName() + ".");
                        }
                        case "language code" -> {
                            String lc = prompter.askForLine("language code");
                            Country country = countriesManager.findFirstByLanguageCode(lc);
                            countriesManager.remove(country);
                            System.out.println("Deleted " + country.getName() + ".");
                        }
                        case "area" -> {
                            int area = prompter.askForInt("area");
                            Country country = countriesManager.findFirstByArea(area);
                            countriesManager.remove(country);
                            System.out.println("Deleted " + country.getName() + ".");
                        }
                        case "population" -> {
                            int population = prompter.askForInt("population");
                            Country country = countriesManager.findFirstByPopulation(population);
                            countriesManager.remove(country);
                            System.out.println("Deleted " + country.getName() + ".");
                        }
                        default -> {
                            System.out.println("Unknown criteria!");
                        }
                    }
                }
                case "list" -> {
                    countriesManager.print();
                }
                default -> {
                    System.out.println("Unknown command!");
                }
            }
        }

    }
}
