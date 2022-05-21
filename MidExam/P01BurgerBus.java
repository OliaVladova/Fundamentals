package SoftUni.Fundamentals.MidExam;

import java.util.Scanner;

public class P01BurgerBus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numCities = Integer.parseInt(scanner.nextLine());

        float totalProfit = 0;
        for (int i = 1; i <= numCities; i++) {
            String city = scanner.nextLine();
            float earned = Float.parseFloat(scanner.nextLine());
            float expenses = Float.parseFloat(scanner.nextLine());
            if (i % 3 == 0 && i % 5 != 0) {
                double over = expenses / 2;
                expenses += over;
            } else {
                if (i % 5 == 0) {
                    earned *= 0.9;
                }
            }
            float dayProfit = earned - expenses;
            totalProfit += dayProfit;
            System.out.printf("In %s Burger Bus earned %.2f leva.\n", city, dayProfit);

        }
        System.out.printf("Burger Bus total profit: %.2f leva.", totalProfit);
    }
}
