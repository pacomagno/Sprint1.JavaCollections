package Level2.exercise2;

import Level2.exercise1.model.Restaurant;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashSet<Restaurant> restaurantSet = new HashSet<>(Arrays.asList(
                new Restaurant("Honest Greens", 5),
                new Restaurant("Himalayan Steaks", 8),
                new Restaurant("Shurupitos Wild", 9)));

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
