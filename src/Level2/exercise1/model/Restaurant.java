package Level2.exercise1.model;

import java.util.Objects;

public class Restaurant {
    private String name;
    private int score;

    public Restaurant(String name, int score) {
        this.name = name;
        this.score = score;

    }
    public int getScore() {
        return score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Restaurant restaurant = (Restaurant) o;
        return score == restaurant.score && Objects.equals(name, restaurant.name);

    }

    @Override
    public int hashCode() {
        return Objects.hash(name, score);

    }

    @Override
    public String toString() {
        return "\nRestaurant " + name + ", Score by Tripadvisor : " + score  + " Stars";
    }
}
