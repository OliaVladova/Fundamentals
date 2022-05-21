package SoftUni.Fundamentals.RegularExpressionsExercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("[>]{2}(?<furniture>[A-Z{1,2}a-z]+)([<]{2})(?<cost>[\\d]+[.{0,1}\\d]*)[!](?<quantity>\\d+)");
       double sum = 0;
        System.out.println("Bought furniture:");
        while (!input.equals("Purchase")) {
            String furniture = input;
            Matcher matcher = pattern.matcher(furniture);

            if (matcher.find()){
                double cost =Double.parseDouble(matcher.group("cost"));
                double quantity =Double.parseDouble(matcher.group("quantity"));
                sum+=cost*quantity;
                System.out.printf("%s\n", matcher.group("furniture"));
            }
            input = scanner.nextLine();
        }
        System.out.printf("Total money spend: %.2f",sum);
    }
}
