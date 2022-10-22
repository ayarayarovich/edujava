package edu.ayarayarovich.task1;

import java.util.Scanner;

// Определить класс "Фотоаппарат", разрешение экрана, разрешение матрицы, вес, размеры.
// Определить функции назначения и изменения полей и функцию вывода на экран.
// Определить производный класс - "Зеркальный фотоаппарат",
// экземпляры которого имею поле тип резьбы объектва. Определить функцию вывода а экран.
// Определить функцию переназначения типа резьбы.

public class Main {
    public static void main(String[] args) {
        Prompter prompter = new Prompter(System.in, System.out,"I need your camera's specs");
        DSLRCamera camera = new DSLRCamera(
                prompter.askForInt("display resolution"),
                prompter.askForInt("sensor resolution"),
                prompter.askForInt("weight"),
                prompter.askForInt("width"),
                prompter.askForInt("height"),
                prompter.askForInt("depth"),
                prompter.askForLine("lens mount type")
        );

        Scanner sc = new Scanner(System.in);
        System.out.print("Do you want me to print it? ");
        if (sc.nextBoolean()) {
            System.out.println(camera);
        }
    }
}
