package SoftUni.Fundamentals.ExerciseMethods;

import java.util.Scanner;

public class P03CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char first = scanner.nextLine().charAt(0);
        char last = scanner.nextLine().charAt(0);
        printBetween(first, last);
    }

    public static void printBetween(char start, char end) {
        int numStart = (int) start;
        int numEnd = (int) end;
        if (start < end) {
            for (int i = numStart + 1; i < numEnd; i++) {
                System.out.printf("%c ", i);
            }
        } else if (start >= end) {
            for (int i = numEnd + 1; i < numStart; i++) {
                System.out.printf("%c ", i);
            }

        }

    }
}
