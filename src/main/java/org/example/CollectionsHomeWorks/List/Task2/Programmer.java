package org.example.CollectionsHomeWorks.List.Task2;

import lombok.Getter;
import lombok.Setter;
import org.example.OOP.encapsulationAndLoop.Student;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Programmer {
    private String name;
    private List<String> programmingLanguage = new ArrayList<>();
    private int age;

    public Programmer(String name, List<String> programmingLanguage, int age) {
        this.name = name;
        this.programmingLanguage = programmingLanguage;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Программист: " + "имя = " + name + ", язык = " + programmingLanguage + ", возраст = " + age;
    }
}
