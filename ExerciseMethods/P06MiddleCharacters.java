package SoftUni.Fundamentals.ExerciseMethods;

import java.util.Arrays;
import java.util.Scanner;

public class P06MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        printMiddleCharacter(input);
    }

    public static void printMiddleCharacter(String text) {

        if (text.length() % 2 != 0) {
            int indexOfMiddle = text.length() / 2;
            System.out.println(text.charAt(indexOfMiddle));
        } else {
            int indexOfMiddle = text.length() / 2 - 1;
            int indexMiddle = text.length() / 2;
            System.out.println(text.charAt(indexOfMiddle) + "" + text.charAt(indexMiddle));
        }


    }
}
