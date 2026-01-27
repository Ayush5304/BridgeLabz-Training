package com.Day1.HealthCheckPro;

import java.lang.reflect.*;

public class HealthCheckPro {

    public static void main(String[] args) throws Exception {

        Class<?> controller = Class.forName(
                "com.healthcheckpro.controller.LabController"
        );

        System.out.println(" HealthCheckPro – API Documentation\n");

        for (Method method : controller.getDeclaredMethods()) {

            boolean isPublic = method.isAnnotationPresent(PublicAPI.class);
            boolean isAuth = method.isAnnotationPresent(RequiresAuth.class);

            if (!isPublic && !isAuth) {
                System.out.println(" WARNING: Method " + method.getName() +
                        "() has NO API annotation!");
                continue;
            }

            System.out.println("API Method: " + method.getName());

            if (isPublic) {
                PublicAPI api = method.getAnnotation(PublicAPI.class);
                System.out.println("  Access : Public");
                System.out.println("  Info   : " + api.description());
            }

            if (isAuth) {
                System.out.println("  Access : Secured (Authentication Required)");
            }

            System.out.println("");
        }
    }
}

