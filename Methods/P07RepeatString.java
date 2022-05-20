package SoftUni.Fundamentals.Methods;

import java.util.Scanner;

public class P07RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int times = Integer.parseInt(scanner.nextLine());

        String result = repeatString(input, times);
        System.out.println(result);
    }

    public static String repeatString(String string, int count) {
        String newText = "";
        for (int i = 0; i < count; i++) {
            newText += string;
        }
        return newText;
    }
}
