package SoftUni.Fundamentals.TextProcessingExercise;

import java.util.Scanner;

public class P06ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder newWord = new StringBuilder(0);
        if (input.length()==0){
            return;
        }
        char previousChar = input.charAt(0);
        newWord.append(previousChar);
        for (int i = 1; i <input.length() ; i++) {
            char symbol = input.charAt(i);
            if (symbol!=previousChar){
                newWord.append(symbol);
                previousChar=symbol;
            }
        }
        System.out.println(newWord);
    }
}
