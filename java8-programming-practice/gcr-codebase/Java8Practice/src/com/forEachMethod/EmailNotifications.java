package com.forEachMethod;

import java.util.*;

public class EmailNotifications {

    public static void main(String[] args) {

        List<String> emails = Arrays.asList(
                "ayush@gmail.com",
                "rohit@gmail.com",
                "neha@gmail.com",
                "karan@gmail.com"
        );

        System.out.println(" Sending Email Notifications:\n");

        emails.forEach(email -> sendEmailNotification(email));
    }

    public static void sendEmailNotification(String email) {
        System.out.println("Email sent successfully to: " + email);
    }
}
