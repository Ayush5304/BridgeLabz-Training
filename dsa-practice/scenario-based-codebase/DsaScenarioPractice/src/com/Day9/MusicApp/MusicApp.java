package com.Day9.MusicApp;

import java.util.Scanner;

public class MusicApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MusicLibraryBST library = new MusicLibraryBST();

        while (true) {

            System.out.println("\nMusic Library");
            System.out.println("1. Add New Track");
            System.out.println("2. Search Track by ID");
            System.out.println("3. Show Playlist Alphabetically");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {

                case 1:
                    System.out.print("Enter Track ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Song Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Artist Name: ");
                    String artist = sc.nextLine();

                    library.insert(id, title, artist);
                    System.out.println("Track added successfully.");
                    break;

                case 2:
                    System.out.print("Enter Track ID to search: ");
                    int searchId = sc.nextInt();
                    library.searchByTrackId(searchId);
                    break;

                case 3:
                    System.out.println("\n🎶 Playlist (Alphabetical Order):");
                    library.showPlaylist();
                    break;

                case 4:
                    System.out.println("Exiting Music App...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
