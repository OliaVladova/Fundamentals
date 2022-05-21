package SoftUni.Fundamentals.TextProcessing;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String word = input;
            List<String> wordLetters = Arrays
                    .stream(input.split(""))
                    .collect(Collectors.toList());
            Collections.reverse(wordLetters);
            String newWord = "";
            for (String symbol:wordLetters) {
                newWord+=symbol;
            }
            System.out.printf("%s = %s\n",word,newWord);
            input = scanner.nextLine();
        }
    }
}
