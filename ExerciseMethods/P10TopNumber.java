package SoftUni.Fundamentals.ExerciseMethods;

import java.util.Scanner;

public class P10TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int number = 1; number <=n ; number++) {
            if (sumDigits(number)&&haveOdd(number)){
                System.out.println(number);
            }
        }

    }

    public static boolean sumDigits(int number) {
            int sum = 0;
            while (number > 0) {
                int digit = number % 10;
                sum += digit;
                number /= 10;
            }

            return sum%8==0;
        }

    public static boolean haveOdd(int number){
            while (number > 0) {
                int digit = number % 10;
                number /= 10;
                if (digit % 2 == 1) {
                    return true;
                }
            }

        return false;
    }

}
