package com.Day11.BagnBallOrganizer;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Bag> bags = new ArrayList<>();

        bags.add(new Bag(101, "Red", 3));
        bags.add(new Bag(102, "Blue", 2));

        Ball b1 = new Ball(1, "Yellow", "small");
        Ball b2 = new Ball(2, "Green", "medium");
        Ball b3 = new Ball(3, "Red", "large");
        Ball b4 = new Ball(4, "Blue", "small");

        bags.get(0).addBall(b1);
        bags.get(0).addBall(b2);
        bags.get(0).addBall(b3);
        bags.get(0).addBall(b4);   

        bags.get(1).addBall(b4);

        bags.get(0).displayBalls();

        bags.get(0).removeBall(2);

        bags.get(0).displayBalls();

        System.out.println("\n=== All Bags Summary ===");
        for (Bag bag : bags) {
            bag.displayInfo();
        }

        sc.close();
    }
}
