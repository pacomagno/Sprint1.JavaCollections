package Level1.exercise3.app;

import java.io.*;
import java.util.*;

public class CountryQuiz {

    public void run() {
        HashMap<String, String> countryMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Alejandro Garcia\\IdeaProjects\\Sprint1.JavaCollections\\src\\Level1\\exercise3\\resources\\countries.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 2) {
                    countryMap.put(parts[0].trim(), parts[1].trim());
                }
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
            return;
        }

        if (countryMap.isEmpty()) {
            System.out.println("No country data found. Please check the countries.txt file.");
            return;
        }

        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();

        Random random = new Random();
        List<String> countries = new ArrayList<>(countryMap.keySet());
        int score = 0;

        for (int i = 0; i < 10; i++) {
            String randomCountry = countries.get(random.nextInt(countries.size()));
            System.out.print("What is the capital of " + randomCountry + "? ");
            String userAnswer = scanner.nextLine();

            if (userAnswer.equalsIgnoreCase(countryMap.get(randomCountry))) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect! The capital is " + countryMap.get(randomCountry));
            }
        }

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Alejandro Garcia\\IdeaProjects\\Sprint1.JavaCollections\\src\\Level1\\exercise3\\resources\\classification.txt", true));
            writer.write(userName + ": " + score + " points");
            writer.newLine();
            writer.close();
            System.out.println("Your score has been saved to classification.txt");
        } catch (IOException e) {
            System.out.println("Error saving your score: " + e.getMessage());
        }

        scanner.close();
    }


}
