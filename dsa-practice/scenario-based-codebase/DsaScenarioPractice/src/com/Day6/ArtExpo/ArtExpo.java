package com.Day6.ArtExpo;

import java.util.ArrayList;

public class ArtExpo {

    public static void insertArtist(ArrayList<Artist> list, Artist newArtist) {

        list.add(newArtist);   
        int i = list.size() - 1;

        while (i > 0 &&
                list.get(i - 1).registrationTime > list.get(i).registrationTime) {

            Artist temp = list.get(i);
            list.set(i, list.get(i - 1));
            list.set(i - 1, temp);

            i--;
        }
    }

    public static void main(String[] args) {

        ArrayList<Artist> artists = new ArrayList<>();

        artists.add(new Artist("Riya", 900));
        artists.add(new Artist("Aman", 910));
        artists.add(new Artist("Neha", 925));
        artists.add(new Artist("Karan", 940));

        System.out.println("Before new registration:");
        System.out.println(artists);

        Artist newArtist = new Artist("Ayush", 920);
        insertArtist(artists, newArtist);

        System.out.println("\nAfter new registration:");
        System.out.println(artists);
    }
}
