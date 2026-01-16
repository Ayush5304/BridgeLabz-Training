package com.Day4.EventManager;

public class QuickSortUtil {

    public static void quickSort(Ticket[] tickets, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(tickets, low, high);
            quickSort(tickets, low, pivotIndex - 1);
            quickSort(tickets, pivotIndex + 1, high);
        }
    }

    private static int partition(Ticket[] tickets, int low, int high) {
        int pivot = tickets[high].getPrice();
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (tickets[j].getPrice() <= pivot) {
                i++;
                Ticket temp = tickets[i];
                tickets[i] = tickets[j];
                tickets[j] = temp;
            }
        }

        Ticket temp = tickets[i + 1];
        tickets[i + 1] = tickets[high];
        tickets[high] = temp;

        return i + 1;
    }
}
