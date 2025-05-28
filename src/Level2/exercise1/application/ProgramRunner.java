package Level2.exercise1.application;

import Level2.exercise1.model.Restaurant;

import java.util.HashSet;

public class ProgramRunner {
    public static void run() {
        HashSet<Restaurant> restaurants = new HashSet<>();

        restaurants.add(new Restaurant("Honest Greens", 5));
        restaurants.add(new Restaurant("Himalayan Steaks", 5));
        restaurants.add(new Restaurant("Himalayan Steaks", 5));
        restaurants.add(new Restaurant("Shurupitos Wild", 4));

        System.out.println(restaurants);
    }
}
