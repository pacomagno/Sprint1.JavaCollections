package Level2.exercise2;

import Level2.exercise1.model.Restaurant;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashSet<Restaurant> restaurantSet = new HashSet<>(Arrays.asList(
                new Restaurant("H10", 5),
                new Restaurant("Hilton", 8),
                new Restaurant("Sheraton", 9)));

        List<Restaurant> sortedList = new ArrayList<>(restaurantSet);
        sortedList.sort(new Comparator<Restaurant>() {
            @Override
            public int compare(Restaurant r1, Restaurant r2) {
                return Integer.compare(r2.getScore(), r1.getScore());
            }
        });


        System.out.println("Restaurants sorted in descending order: " + sortedList);
    }
}
