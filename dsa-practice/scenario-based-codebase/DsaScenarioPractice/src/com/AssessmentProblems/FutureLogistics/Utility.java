package com.AssessmentProblems.FutureLogistics;

public class Utility {

    public boolean validateTransportId(String id) {

        if (id != null && id.matches("RTS\\d{3}[A-Z]"))
            return true;

        System.out.println("Transport id " + id + " is invalid");
        System.out.println("Please provide a valid record");
        return false;
    }

    public GoodsTransport parseDetails(String input) {

        String[] a = input.split(":");

        String id = a[0];
        String date = a[1];
        int rating = Integer.parseInt(a[2]);
        String type = a[3];

        if (!validateTransportId(id))
            return null;

        if (type.equalsIgnoreCase("BrickTransport")) {

            float size = Float.parseFloat(a[4]);
            int qty = Integer.parseInt(a[5]);
            float price = Float.parseFloat(a[6]);

            return new BrickTransport(id, date, rating, size, qty, price);
        }

        if (type.equalsIgnoreCase("TimberTransport")) {

            float length = Float.parseFloat(a[4]);
            float radius = Float.parseFloat(a[5]);
            String ttype = a[6];
            float price = Float.parseFloat(a[7]);

            return new TimberTransport(id, date, rating, length, radius, ttype, price);
        }

        return null;
    }

    public String findObjectType(GoodsTransport g) {
        if (g instanceof BrickTransport) return "BrickTransport";
        if (g instanceof TimberTransport) return "TimberTransport";
        return "Unknown";
    }
}
