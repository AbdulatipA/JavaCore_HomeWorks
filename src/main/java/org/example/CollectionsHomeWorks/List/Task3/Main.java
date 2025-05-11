package org.example.CollectionsHomeWorks.List.Task3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String departure;
        String arrival;
        String fullName;

        Scanner sc = new Scanner(System.in);
        Set<Ticket> tickets = new HashSet<>();


        while (true) {
            System.out.println("Город отправления?");
            departure = sc.nextLine().trim();
            System.out.println("Город прибытия?");
            arrival = sc.nextLine().trim();
            System.out.println("ФИО");
            fullName = sc.nextLine().trim();

            Ticket ticket = new Ticket(departure, arrival, fullName);

            tickets.add(ticket);

            System.out.println("Хотите ввести еще данные? (да/нет)");
            String answer = sc.nextLine().toLowerCase().trim();
            if (answer.equalsIgnoreCase("нет")) {
                break;
            }
        }
        for (Ticket ticket : tickets) {
            System.out.println(ticket);
        }
    }
}
