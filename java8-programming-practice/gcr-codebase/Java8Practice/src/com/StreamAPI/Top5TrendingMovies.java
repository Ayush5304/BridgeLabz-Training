package com.StreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class Top5TrendingMovies {

    static class Movie {
        String name;
        double rating;
        int year;

        public Movie(String name, double rating, int year) {
            this.name = name;
            this.rating = rating;
            this.year = year;
        }

        public double getRating() {
            return rating;
        }

        public int getYear() {
            return year;
        }

        @Override
        public String toString() {
            return name + " | Rating: " + rating + " | Year: " + year;
        }
    }

    public static void main(String[] args) {

        List<Movie> movies = Arrays.asList(
                new Movie("Inception", 8.8, 2010),
                new Movie("Interstellar", 8.6, 2014),
                new Movie("Avengers Endgame", 8.4, 2019),
                new Movie("The Dark Knight", 9.0, 2008),
                new Movie("Joker", 8.5, 2019),
                new Movie("Oppenheimer", 8.9, 2023),
                new Movie("Dune Part 2", 8.7, 2024)
        );

        List<Movie> top5Movies =
                movies.stream()
                        .filter(m -> m.getRating() >= 8)  
                        .sorted( Comparator.comparing(Movie::getRating).reversed()
                           .thenComparing(Movie::getYear).reversed())
                        .limit(5)                         
                        .collect(Collectors.toList());   

        System.out.println(" Top 5 Trending Movies:");
        top5Movies.forEach(System.out::println);
    }
}
