package SoftUni.Fundamentals.RegularExpressionsExercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P03SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Pattern validOrder = Pattern.compile("%(?<name>[A-Z][a-z]*)%[^|$%.]*<(?<product>\\w+)>[^|$%.]*\\|(?<quantity>[0-9]+)\\|[^|$%.]*?(?<price>[0-9]+\\.*[0-9]*)\\$");

        double total = 0;
        while (!input.equals("end of shift")){
            Matcher matcher = validOrder.matcher(input);
            if (matcher.find()){
                String name = matcher.group("name");
                String product = matcher.group("product");
               int quantity= Integer.parseInt(matcher.group("quantity"));
                double prizeForOne = Double.parseDouble(matcher.group("price"));
                double prize = quantity*prizeForOne;
                total+=prize;
                System.out.printf("%s: %s - %.2f\n",name,product,prize);
            }
            input=scanner.nextLine();
        }
        System.out.printf("Total income: %.2f",total);
    }
}
