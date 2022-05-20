package SoftUni.Fundamentals.ExerciseMethods;

import java.util.Scanner;

public class P09PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        while (!command.equals("END")) {
            String input = command;

            boolean isPalindrome = printKindNumber(input);
            System.out.println(isPalindrome);
            command = scanner.nextLine();
        }
    }

    public static boolean printKindNumber(String num) {
        String backwards = "";
        for (int i = num.length()-1; i >= 0; i--) {
            char symbol = num.charAt(i);
            backwards += symbol;
        }
        if (backwards.equals(num)){
            return true;
        }
            return false;
    }
}
