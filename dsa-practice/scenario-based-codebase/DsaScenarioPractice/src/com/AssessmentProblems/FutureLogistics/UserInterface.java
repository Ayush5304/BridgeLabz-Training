package com.AssessmentProblems.FutureLogistics;

import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Utility util = new Utility();

        System.out.println("Enter the Goods Transport details");
        String input = sc.nextLine();

        GoodsTransport obj = util.parseDetails(input);

        if (obj == null)
            return;

        String type = util.findObjectType(obj);

        System.out.println("Transporter id : " + obj.getTransportId());
        System.out.println("Date of transport : " + obj.getTransportDate());
        System.out.println("Rating of the transport : " + obj.getTransportRating());

        if (type.equals("BrickTransport")) {

            BrickTransport b = (BrickTransport) obj;

            System.out.println("Quantity of bricks : " + b.getBrickQuantity());
            System.out.println("Brick price : " + b.getBrickPrice());
            System.out.println("Vehicle for transport : " + b.vehicleSelection());
            System.out.println("Total charge : " + b.calculateTotalCharge());
        }

        else if (type.equals("TimberTransport")) {

            TimberTransport t = (TimberTransport) obj;

            System.out.println("Type of the timber : " + t.getTimberType());
            System.out.println("Timber price per kilo : " + t.getTimberPrice());
            System.out.println("Vehicle for transport : " + t.vehicleSelection());
            System.out.println("Total charge : " + t.calculateTotalCharge());
        }
    }
}
