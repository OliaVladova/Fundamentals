package SoftUni.Fundamentals.Methods;

import java.util.Scanner;

public class P05Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        resultPrint(product,quantity);
    }

    public static void resultPrint(String item, int amount) {
        double result = 0;
        switch (item) {
            case "coffee":
                result = amount * 1.50;
                break;
            case "water":
                result = amount * 1.00;
                break;
            case "coke":
                result = amount * 1.40;
                break;
            case "snacks":
                result = amount * 2.00;
                break;
        }
        System.out.printf("%.2f",result);
    }
}
