package SoftUni.Fundamentals.ExamPreparation;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Pattern patternFood = Pattern.compile("([#|\\|])(?<name>[A-Za-z ]+)(\\1)(?<date>\\d{2}[\\/]\\d{2}[\\/]\\d{2})(\\1)(?<calories>\\d{1,5})(\\1)");

        Matcher matcherFood = patternFood.matcher(input);
        List<String> itemList = new ArrayList<>();
        int total = 0;
        while (matcherFood.find()) {
            int calories = Integer.parseInt(matcherFood.group("calories"));
            String name = matcherFood.group("name");
            String expirationDate = matcherFood.group("date");
            String caloriesStr = matcherFood.group("calories");
            itemList.add(String.format("Item: %s, Best before: %s, Nutrition: %s",name,expirationDate,caloriesStr));

            total+=calories;

        }
        int days =total/2000;
        System.out.printf("You have food to last you for: %d days!\n",days);
        for (String item:itemList) {
            System.out.println(item);;
        }
    }
}
