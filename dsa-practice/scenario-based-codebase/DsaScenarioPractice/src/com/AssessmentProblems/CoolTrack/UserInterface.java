package com.AssessmentProblems.CoolTrack;

import java.util.*;

public class UserInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DataCenterUtil util = new DataCenterUtil();

        System.out.println("Enter the number of data centers to be added");
        int n = Integer.parseInt(sc.nextLine());

        System.out.println("Enter data center details");

        for (int i = 0; i < n; i++) {

            String input = sc.nextLine();
            String[] parts = input.split(":");

            DataCenter dc = new DataCenter(
                    parts[0],
                    parts[1],
                    parts[2],
                    Double.parseDouble(parts[3])
            );

            util.addDataCenter(dc);
        }

        System.out.println("Enter the Data Center ID to get details");
        String searchId = sc.nextLine();

        DataCenter found = util.getDataCenterById(searchId);

        if (found == null) {
            System.out.println("Data Center not found for the ID " + searchId);
        } else {
            System.out.println(found.getDataCenterId() + " | " +
                    found.getLocation() + " | " +
                    found.getSupervisorName() + " | " +
                    found.getCoolingPowerUsage());
        }

        System.out.println("Data Centers with maximum cooling power usage");

        List<DataCenter> maxList =
                util.getDataCentersWithMaximumCoolingPowerUsage();

        for (DataCenter dc : maxList) {
            System.out.println(dc.getDataCenterId() + " | " +
                    dc.getLocation() + " | " +
                    dc.getSupervisorName() + " | " +
                    dc.getCoolingPowerUsage());
        }
    }
}
