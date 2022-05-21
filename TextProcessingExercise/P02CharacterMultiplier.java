package SoftUni.Fundamentals.TextProcessingExercise;

import java.util.Scanner;

public class P02CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputStrings = scanner.nextLine().split(" ");
        String first = inputStrings[0];
        String second = inputStrings[1];
        int size = Math.max(first.length(), second.length());
        int sum = 0;
        for (int i = 0; i < size; i++) {
            if (i < first.length() && i < second.length()) {
                sum += first.charAt(i) * second.charAt(i);
            } else if (i < first.length()) {
                sum += first.charAt(i);
            } else {
                sum += second.charAt(i);
            }
        }
        System.out.println(sum);

    }
}
