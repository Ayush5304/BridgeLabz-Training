package com.StreamAPI;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class ExpiringMemberships {

    static class Member {
        String name;
        LocalDate expiryDate;

        public Member(String name, LocalDate expiryDate) {
            this.name = name;
            this.expiryDate = expiryDate;
        }

        public LocalDate getExpiryDate() {
            return expiryDate;
        }

        @Override
        public String toString() {
            return name + " | Expiry: " + expiryDate;
        }
    }

    public static void main(String[] args) {

        List<Member> members = Arrays.asList(
                new Member("Amit", LocalDate.now().plusDays(5)),
                new Member("Rohit", LocalDate.now().plusDays(20)),
                new Member("Neha", LocalDate.now().plusDays(40)),
                new Member("Pooja", LocalDate.now().plusDays(10)),
                new Member("Karan", LocalDate.now().plusDays(60))
        );

        LocalDate today = LocalDate.now();
        LocalDate next30Days = today.plusDays(30);

        List<Member> expiringSoon =
                members.stream()
                        .filter(m -> m.getExpiryDate().isAfter(today)
                                && m.getExpiryDate().isBefore(next30Days))
                        .collect(Collectors.toList());

        System.out.println(" Members whose membership expires in next 30 days:\n");
        expiringSoon.forEach(System.out::println);
    }
}
