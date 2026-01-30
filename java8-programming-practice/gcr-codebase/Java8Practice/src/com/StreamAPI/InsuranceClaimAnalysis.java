package com.StreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class InsuranceClaimAnalysis {

    static class InsuranceClaim {
        String type;
        double amount;

        public InsuranceClaim(String type, double amount) {
            this.type = type;
            this.amount = amount;
        }

        public String getType() {
            return type;
        }

        public double getAmount() {
            return amount;
        }
    }

    public static void main(String[] args) {

        List<InsuranceClaim> claims = Arrays.asList(
                new InsuranceClaim("Health", 50000),
                new InsuranceClaim("Health", 30000),
                new InsuranceClaim("Vehicle", 20000),
                new InsuranceClaim("Vehicle", 40000),
                new InsuranceClaim("Life", 100000),
                new InsuranceClaim("Life", 80000)
        );

        Map<String, Double> avgClaimByType =
                claims.stream()
                        .collect(Collectors.groupingBy(
                                InsuranceClaim::getType,
                                Collectors.averagingDouble(InsuranceClaim::getAmount)
                        ));

        System.out.println(" Average Claim Amount by Type:");
        avgClaimByType.forEach((type, avg) ->
                System.out.println(type + " → " + avg));
    }
}
