package com.Day4.EventManager;

public class EventManager {

    public static void main(String[] args) {

        Ticket[] tickets = {
                new Ticket(1200),
                new Ticket(500),
                new Ticket(800),
                new Ticket(1500),
                new Ticket(300),
                new Ticket(2000),
                new Ticket(900),
                new Ticket(400)
        };

        System.out.println("Before Sorting:");
        printTickets(tickets);

        QuickSortUtil.quickSort(tickets, 0, tickets.length - 1);

        System.out.println("\nAfter Sorting:");
        printTickets(tickets);

        System.out.println("\nTop 3 Cheapest Tickets:");
        for (int i = 0; i < 3; i++) {
            System.out.println(tickets[i]);
        }
    }

    public static void printTickets(Ticket[] tickets) {
        for (Ticket t : tickets) {
            System.out.print(t + " ");
        }
        System.out.println();
    }
}
