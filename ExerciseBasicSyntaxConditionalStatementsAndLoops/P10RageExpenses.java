package SoftUni.Fundamentals.ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P10RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lost = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double  keyboardPrice = Double.parseDouble(scanner.nextLine());
        double  displayPrice = Double.parseDouble(scanner.nextLine());

        int headset = lost/2;
        int mouse = lost/3;
        int keyboard = lost/6;
        int display = keyboard/2;

        double money = headset*headsetPrice + mouse*mousePrice+keyboard*keyboardPrice+display*displayPrice;

        System.out.printf("Rage expenses: %.2f lv.",money);


    }
}
