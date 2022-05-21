package SoftUni.Fundamentals.ObjectAndClasses;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] wordsArr = input.split("\\s+");

        Random numGenerator = new Random();
        for (int i = 0; i < wordsArr.length ; i++) {
            int firstPos = numGenerator.nextInt(wordsArr.length);
            int secondPos = numGenerator.nextInt(wordsArr.length);
            String firstPosition = wordsArr[firstPos];

            wordsArr[firstPos] = wordsArr[secondPos];
            wordsArr[secondPos] = firstPosition;

        }
        System.out.println(String.join(System.lineSeparator(),wordsArr));
    }
}
