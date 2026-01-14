package com.Day10.EcoWingBirdSanctuary;

import java.lang.reflect.*;

class AnnotationReader {

    public static void showDeveloperInfo(Class<?> cls) {
        if (cls.isAnnotationPresent(DeveloperInfo.class)) {
            DeveloperInfo info = cls.getAnnotation(DeveloperInfo.class);
            System.out.println("Developer: " + info.name());
            System.out.println("Version: " + info.version());
        }
    }
}
