package com.LambdaExpressions.NotificationFiltering;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class NotificationFiltering {

    public static void main(String[] args) {

        List<Alert> alerts = List.of(
                new Alert("MEDICAL", "Blood test abnormal", 5),
                new Alert("MEDICINE", "Take insulin dose", 4),
                new Alert("APPOINTMENT", "Doctor visit at 5 PM", 3),
                new Alert("EMERGENCY", "ICU patient critical", 5),
                new Alert("GENERAL", "Health tips for today", 1)
        );

        Predicate<Alert> onlyCritical =
                a -> a.priority >= 4;

        Predicate<Alert> onlyMedical =
                a -> a.type.equals("MEDICAL") || a.type.equals("EMERGENCY");

        System.out.println(" Critical Alerts:\n");
        filterAndPrint(alerts, onlyCritical);

        System.out.println("\n Medical + Emergency Alerts:\n");
        filterAndPrint(alerts, onlyMedical);
    }

    private static void filterAndPrint(List<Alert> alerts,
                                       Predicate<Alert> condition) {

        alerts.stream()
              .filter(condition)
              .forEach(System.out::println);
    }
}
