package SoftUni.Fundamentals.DataTypesAndVariablesLab;

import java.util.Scanner;

public class P07ReversedChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char symbolOne = scanner.nextLine().charAt(0);
        char symbolSecond = scanner.nextLine().charAt(0);
        char symbolThird = scanner.nextLine().charAt(0);

        System.out.printf("%c %c %c",symbolThird,symbolSecond,symbolOne);
    }
}
