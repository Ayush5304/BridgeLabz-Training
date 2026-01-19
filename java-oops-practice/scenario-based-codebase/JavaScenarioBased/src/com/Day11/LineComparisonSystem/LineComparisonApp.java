package com.Day11.LineComparisonSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class LineComparisonApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Line> lines = new ArrayList<>();

        System.out.print("How many lines do you want to enter? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nEnter coordinates for Line " + i + ":");

            System.out.print("x1: ");
            double x1 = sc.nextDouble();
            System.out.print("y1: ");
            double y1 = sc.nextDouble();
            System.out.print("x2: ");
            double x2 = sc.nextDouble();
            System.out.print("y2: ");
            double y2 = sc.nextDouble();

            Line line = new Line(x1, y1, x2, y2);
            lines.add(line);
        }

        System.out.println("\n Line Length Comparisons ");

        for (int i = 0; i < lines.size() - 1; i += 2) {
            Line l1 = lines.get(i);
            Line l2 = lines.get(i + 1);

            double len1 = l1.calculateLength();
            double len2 = l2.calculateLength();

            System.out.println("\nComparison " + ((i/2) + 1));
            System.out.println("Line 1: " + l1.getCoordinates() + " | Length = " + len1);
            System.out.println("Line 2: " + l2.getCoordinates() + " | Length = " + len2);

            if (len1 == len2) {
                System.out.println("Result: Both lines are equal.");
            } else if (len1 > len2) {
                System.out.println("Result: Line 1 is longer.");
            } else {
                System.out.println("Result: Line 2 is longer.");
            }
        }

        sc.close();
    }
}
