package org.example.CollectionsHomeWorks.List.Task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Programmer programmer1 = new Programmer("Alex", new ArrayList<>(Arrays.asList("Java", "C++")), 28);
        Programmer programmer2 = new Programmer("Anna", new ArrayList<>(Arrays.asList("JS", "C++")), 34);
        Programmer programmer3 = new Programmer("Sam", new ArrayList<>(Arrays.asList("Rust", "Java")), 30);
        Programmer programmer4 = new Programmer("Nik", new ArrayList<>(Arrays.asList("C", "Java")), 30);
        Programmer programmer5 = new Programmer("Maxim", new ArrayList<>(Arrays.asList("C#", "Python")), 24);
        Programmer programmer6 = new Programmer("Jack", new ArrayList<>(Arrays.asList("Swift", "Kotlin")), 40);
        Programmer programmer7 = new Programmer("Yana", new ArrayList<>(Arrays.asList("Go")), 19);

        List<Programmer> programmers = new ArrayList<>();
        programmers.add(programmer1);
        programmers.add(programmer2);
        programmers.add(programmer3);
        programmers.add(programmer4);
        programmers.add(programmer5);
        programmers.add(programmer6);
        programmers.add(programmer7);

        System.out.println("Ввведите название языка, для поиска нужного вам программиста");

        Scanner sc = new Scanner(System.in);
        String lang = sc.nextLine();


        List<Programmer> list = programmers.stream()
                        .filter(e -> e.getProgrammingLanguage().stream()
                                .anyMatch(l -> l.equalsIgnoreCase(lang)))
                                .toList();

        for (Programmer programmer : list) {
            System.out.println(programmer);
        }
    }
}
