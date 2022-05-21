package SoftUni.Fundamentals.ObjectsAndClassesExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class P01AdvertisementMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        List<String> laudatoryPhrase = new ArrayList<>();
        laudatoryPhrase.add("Excellent product.");
        laudatoryPhrase.add("Such a great product.");
        laudatoryPhrase.add("I always use that product.");
        laudatoryPhrase.add("Best product of its category.");
        laudatoryPhrase.add("Exceptional product.");
        laudatoryPhrase.add("I can’t live without this product.");

        List<String> event = new ArrayList<>();
        event.add("Now I feel good.");
        event.add("I have succeeded with this product.");
        event.add("Makes miracles. I am happy of the results!");
        event.add("I cannot believe but now I feel awesome.");
        event.add("Try it yourself, I am very satisfied.");
        event.add("I feel great!");

        List<String> author = new ArrayList<>();
        author.add("Diana");
        author.add("Petya");
        author.add("Stella");
        author.add("Elena");
        author.add("Katya");
        author.add("Iva");
        author.add("Annie");
        author.add("Eva");

        List<String> city = new ArrayList<>();
        city.add("Burgas");
        city.add("Sofia");
        city.add("Plovdiv");
        city.add("Varna");
        city.add("Ruse");

        Random randomNum = new Random();

        for (int i = 0; i < num; i++) {
            System.out.printf("%s %s %s - %s\n",laudatoryPhrase.get(randomNum.nextInt(laudatoryPhrase.size())),event.get(randomNum.nextInt(event.size())),
            author.get(randomNum.nextInt(author.size())),city.get(randomNum.nextInt(city.size())));
        }
    }
}
