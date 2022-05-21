package SoftUni.Fundamentals.More;

import java.util.Scanner;

public class P04RefactoringPrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberStop = Integer.parseInt(scanner.nextLine());
        for (int start = 2; start <= numberStop; start++) {
            boolean isPrime = true;
            for (int checker = 2; checker < start; checker++) {
                if (start % checker == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n", start, isPrime);
        }

    }
}
