package SoftUni.Fundamentals.MapsLambdaAndStreamAPIExercise;

import java.util.*;

public class P04Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Double> productPrize = new LinkedHashMap<>();
        Map<String, Integer> productAmount = new LinkedHashMap<>();
        while (!input.equals("buy")){
            String[] command = input.split(" ");
            String product = command[0];
            double prize = Double.parseDouble(command[1]);
            int amount = Integer.parseInt(command[2]);

            productPrize.put(product,prize);
            if (!productAmount.containsKey(product)) {
                productAmount.put(product,amount);
            }else {
                productAmount.put(product,productAmount.get(product)+amount);
            }

            input=scanner.nextLine();
        }
        for (Map.Entry<String,Double>entry:productPrize.entrySet()) {
            String productName = entry.getKey();
            double finalSum = entry.getValue()*productAmount.get(productName);
            System.out.printf("%s -> %.2f%n", productName, finalSum);
        }
    }
}
