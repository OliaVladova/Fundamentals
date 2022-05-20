package SoftUni.Fundamentals.ExerciseMethods;

import java.util.Scanner;

public class P02VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int result = vowelsCount(input);
        System.out.println(result);
    }

    public static int vowelsCount(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            if (symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u'||symbol == 'A' || symbol == 'E' || symbol == 'I' || symbol == 'O' || symbol == 'U') {
                count++;
            }
        }
        return count;
    }
}
