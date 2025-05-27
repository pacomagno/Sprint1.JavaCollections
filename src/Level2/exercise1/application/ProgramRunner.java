package Level2.exercise1.application;

import Level2.exercise1.model.Restaurant;

import java.util.HashSet;

public class ProgramRunner {
    public static void run() {
        HashSet<Restaurant> restaurants = new HashSet<>();

        restaurants.add(new Restaurant("H10", 5));
        restaurants.add(new Restaurant("Hilton", 5));
        restaurants.add(new Restaurant("Hilton", 5));
        restaurants.add(new Restaurant("Sheraton", 4));

        System.out.println(restaurants);
    }
}
