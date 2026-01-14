package com.Day10.EcoWingBirdSanctuary;
public class EcoWingApp {

    public static void main(String[] args) {

        Sanctuary sanctuary = new Sanctuary();

        sanctuary.addBird(new Eagle("Golden Eagle", "B101"));
        sanctuary.addBird(new Duck("Mallard", "B102"));
        sanctuary.addBird(new Penguin("Emperor", "B103"));
        sanctuary.addBird(new Kiwi("Brown Kiwi", "B104"));

        System.out.println("=== All Birds ===");
        sanctuary.displayAllBirds();

        System.out.println("\n=== Flying Birds ===");
        sanctuary.displayFlyingBirds();

        System.out.println("\n=== Swimming Birds ===");
        sanctuary.displaySwimmingBirds();

        System.out.println("\n=== Sanctuary Report ===");
        sanctuary.sanctuaryReport();

        System.out.println("\n=== Developer Info (Reflection) ===");
        AnnotationReader.showDeveloperInfo(Bird.class);
    }
}
