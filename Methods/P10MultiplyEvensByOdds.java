package SoftUni.Fundamentals.Methods;

import java.util.Scanner;

public class P10MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int multiplicationResult = getMultipleOfEvensAndOdds(number);
        System.out.println(multiplicationResult);
    }

    public static int getMultipleOfEvensAndOdds(int number) {
        int sumEven = getEvens(number);
        int sumOdd = getOdds(number);
        int result = sumEven * sumOdd;
        return result;
    }

    public static int getEvens(int number) {
        int sumEven = 0;
        while (number != 0) {
            int num = number % 10;
            if (num % 2 == 0) {
                sumEven += num;
            }
            number /= 10;
        }
        return sumEven;
    }

    public static int getOdds(int number) {
        int sumOdds = 0;
        while (number != 0) {
            int num = number % 10;
            if (num % 2 != 0) {
                sumOdds += num;
            }
            number /= 10;
        }
        return sumOdds;
    }
}
