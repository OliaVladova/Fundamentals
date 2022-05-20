package SoftUni.Fundamentals.ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class P09SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());
        int countDays = 0;
        int extract = 0;
        int total = 0;

        while (startingYield >= 100) {
            extract = startingYield - 26;
            total += extract;
            countDays++;
            startingYield -= 10;
        }
        if (total>=26) {
            total -= 26;
        }
        System.out.printf("%d\n",countDays);
        System.out.printf("%d",total);
    }
}
