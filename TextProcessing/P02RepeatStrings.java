package SoftUni.Fundamentals.TextProcessing;

import java.util.Arrays;
import java.util.Scanner;

public class P02RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputWords = scanner.nextLine().split(" ");
        StringBuilder repeatedWords = new StringBuilder();
        for (String word:inputWords) {
            int length = word.length();
            for (int i = 0; i <length ; i++) {
                repeatedWords.append(word);
            }
        }
        System.out.printf("%s",repeatedWords);

    }
}
