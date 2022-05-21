package SoftUni.Fundamentals.TextProcessingExercise;

import java.util.Scanner;

public class P04CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String textInput = scanner.nextLine();
        StringBuilder encryptedText = new StringBuilder();

        for (int i = 0; i <textInput.length() ; i++) {
            char symbol = textInput.charAt(i);
            char newSymbol = (char) (symbol+3);
            encryptedText.append(newSymbol);
        }
        System.out.println(encryptedText);

    }
}
