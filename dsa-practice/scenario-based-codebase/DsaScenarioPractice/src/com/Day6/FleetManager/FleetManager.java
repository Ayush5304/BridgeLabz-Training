package com.Day6.FleetManager;

import java.util.ArrayList;

public class FleetManager {

    public static ArrayList<Vehicle> mergeLists(
            ArrayList<Vehicle> depot1,
            ArrayList<Vehicle> depot2) {

        ArrayList<Vehicle> masterList = new ArrayList<>();

        int i = 0, j = 0;

        while (i < depot1.size() && j < depot2.size()) {

            if (depot1.get(i).mileage <= depot2.get(j).mileage) {
                masterList.add(depot1.get(i));
                i++;
            } else {
                masterList.add(depot2.get(j));
                j++;
            }
        }

        // Add remaining vehicles from depot1
        while (i < depot1.size()) {
            masterList.add(depot1.get(i));
            i++;
        }

        // Add remaining vehicles from depot2
        while (j < depot2.size()) {
            masterList.add(depot2.get(j));
            j++;
        }

        return masterList;
    }

    public static void main(String[] args) {

        ArrayList<Vehicle> depotA = new ArrayList<>();
        depotA.add(new Vehicle("TR-01", 12000));
        depotA.add(new Vehicle("TR-02", 18000));
        depotA.add(new Vehicle("TR-03", 25000));

        ArrayList<Vehicle> depotB = new ArrayList<>();
        depotB.add(new Vehicle("TR-10", 10000));
        depotB.add(new Vehicle("TR-11", 20000));
        depotB.add(new Vehicle("TR-12", 30000));

        System.out.println("Depot A: " + depotA);
        System.out.println("Depot B: " + depotB);

        ArrayList<Vehicle> masterSchedule =
                mergeLists(depotA, depotB);

        System.out.println("\nMaster Maintenance Schedule:");
        System.out.println(masterSchedule);
    }
}
